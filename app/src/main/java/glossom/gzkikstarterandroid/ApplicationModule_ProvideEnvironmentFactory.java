package glossom.gzkikstarterandroid;

import dagger.internal.Factory;

/**
 * Created by zheng.gong on 2017/02/06.
 */
public final class ApplicationModule_ProvideEnvironmentFactory  implements Factory<Environment> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideEnvironmentFactory(ApplicationModule module) {
        this.module = module;
    }

    @Override
    public Environment get() {
        return null;
    }

    public static Factory<Environment> create(ApplicationModule module) {
        return new ApplicationModule_ProvideEnvironmentFactory(module);
    }
}
