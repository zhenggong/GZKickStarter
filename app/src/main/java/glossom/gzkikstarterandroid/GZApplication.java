package glossom.gzkikstarterandroid;

import android.support.annotation.CallSuper;
import android.support.multidex.MultiDexApplication;

/**
 * Created by zheng.gong on 2017/02/06.
 */

public class GZApplication extends MultiDexApplication {
    private ApplicationComponent component;
    @Override
    @CallSuper
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component().inject(this);

    }

    public ApplicationComponent component() {
        return component;
    }
}
