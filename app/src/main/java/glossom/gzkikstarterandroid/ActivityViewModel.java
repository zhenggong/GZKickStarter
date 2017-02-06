package glossom.gzkikstarterandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import rx.subjects.PublishSubject;

/**
 * Created by zheng.gong on 2017/02/06.
 */
public class ActivityViewModel<ViewType extends ActivityLifecycleType> {
    private final PublishSubject<ViewType> viewChange = PublishSubject.create();
    @CallSuper
    protected void onCreate(final @NonNull Context context, final @Nullable Bundle savedInstanceState) {
        dropView();
    }

    private void dropView() {
        viewChange.onNext(null);
    }

}
