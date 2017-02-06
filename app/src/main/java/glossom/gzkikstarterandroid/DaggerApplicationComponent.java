package glossom.gzkikstarterandroid;

import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.ScopedProvider;

/**
 * Created by zheng.gong on 2017/02/06.
 */

public final class DaggerApplicationComponent implements ApplicationComponent {
    private Provider<Environment> provideEnvironmentProvider;
    private MembersInjector<GZApplication> kSApplicationMembersInjector;
    private void initialize(Builder builder){
        this.provideEnvironmentProvider = ScopedProvider.create(ApplicationModule_ProvideEnvironmentFactory.create(builder.applicationModule));
    }

    private DaggerApplicationComponent(Builder builder) {
        assert builder != null;
        initialize(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public Environment environment() {
        return provideEnvironmentProvider.get();
    }

    @Override
    public void inject(GZApplication __) {
        kSApplicationMembersInjector.injectMembers(__);
    }

    public static final class Builder {
        private ExternalApplicationModule externalApplicationModule;
        private ApplicationModule applicationModule;

        private Builder() {
        }

        public ApplicationComponent build() {
            if (externalApplicationModule == null) {
                this.externalApplicationModule = new ExternalApplicationModule();
            }
            if (applicationModule == null) {
                throw new IllegalStateException("applicationModule must be set");
            }
            return new DaggerApplicationComponent(this);
        }

        public Builder externalApplicationModule(ExternalApplicationModule externalApplicationModule) {
            if (externalApplicationModule == null) {
                throw new NullPointerException("externalApplicationModule");
            }
            this.externalApplicationModule = externalApplicationModule;
            return this;
        }

        public Builder applicationModule(ApplicationModule applicationModule) {
            if (applicationModule == null) {
                throw new NullPointerException("applicationModule");
            }
            this.applicationModule = applicationModule;
            return this;
        }
    }
}
