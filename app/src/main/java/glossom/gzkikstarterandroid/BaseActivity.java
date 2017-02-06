package glossom.gzkikstarterandroid;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zheng.gong on 2017/02/06.
 */
public abstract class BaseActivity<ViewModelType extends ActivityViewModel> extends AppCompatActivity {
    protected DiscoveryViewModel viewModel;
    private static final String VIEW_MODEL_KEY = "viewModel";
    /**
     * Get viewModel.
     */
//    public ViewModelType viewModel() {
//        return ViewModelType;
//    }

    @CallSuper
    @Override
    protected void onCreate(final @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assignViewModel(null);
    }

    @CallSuper
    @Override
    protected void onResume() {
        super.onResume();
        assignViewModel(null);
    }

    private void assignViewModel(final @Nullable Bundle viewModelEnvelope) {
        if (viewModel == null) {
            this.viewModel = new DiscoveryViewModel();
//            final RequiresActivityViewModel annotation = getClass().getAnnotation(RequiresActivityViewModel.class);
//            final Class<ViewModelType> viewModelClass = annotation == null ? null : (Class<ViewModelType>) annotation.value();
//            if (viewModelClass != null) {
//                viewModel = ActivityViewModelManager.getInstance().fetch(this,
//                        viewModelClass,
//                        BundleUtils.maybeGetBundle(viewModelEnvelope, VIEW_MODEL_KEY));
//            }
        }
    }

}
