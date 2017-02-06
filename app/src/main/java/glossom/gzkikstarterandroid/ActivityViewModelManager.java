package glossom.gzkikstarterandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by zheng.gong on 2017/02/06.
 */
public class ActivityViewModelManager {
    private static final String VIEW_MODEL_ID_KEY = "view_model_id";
    private static final String VIEW_MODEL_STATE_KEY = "view_model_state";
    private static final ActivityViewModelManager instance = new ActivityViewModelManager();
    private Map<String, ActivityViewModel> viewModels = new HashMap<>();
    public <T extends ActivityViewModel> T fetch(final @NonNull Context context, final @NonNull Class<T> viewModelClass,
                                                 final @Nullable Bundle savedInstanceState) {
        final String id = fetchId(savedInstanceState);
        ActivityViewModel activityViewModel = viewModels.get(id);

        if (activityViewModel == null) {
            activityViewModel = create(context, viewModelClass, savedInstanceState, id);
        }

        return (T) activityViewModel;
    }

    public static @NonNull ActivityViewModelManager getInstance() {
        return instance;
    }

    private <T extends ActivityViewModel> ActivityViewModel create(final @NonNull Context context, final @NonNull Class<T> viewModelClass,
                                                                   final @Nullable Bundle savedInstanceState, final @NonNull String id) {

        final GZApplication application = (GZApplication) context.getApplicationContext();
        final Environment environment = application.component().environment();
        final ActivityViewModel activityViewModel;

        try {
            final Constructor constructor = viewModelClass.getConstructor();
            activityViewModel = (ActivityViewModel) constructor.newInstance(environment);

            // Need to catch these exceptions separately, otherwise the compiler turns them into `ReflectiveOperationException`.
            // That exception is only available in API19+
        } catch (IllegalAccessException exception) {
            throw new RuntimeException(exception);
        } catch (InvocationTargetException exception) {
            throw new RuntimeException(exception);
        } catch (InstantiationException exception) {
            throw new RuntimeException(exception);
        } catch (NoSuchMethodException exception) {
            throw new RuntimeException(exception);
        }

        viewModels.put(id, activityViewModel);
        activityViewModel.onCreate(context, BundleUtils.maybeGetBundle(savedInstanceState, VIEW_MODEL_STATE_KEY));

        return activityViewModel;
    }

    private String fetchId(final @Nullable Bundle savedInstanceState) {
        return savedInstanceState != null ?
                savedInstanceState.getString(VIEW_MODEL_ID_KEY) :
                UUID.randomUUID().toString();
    }
}
