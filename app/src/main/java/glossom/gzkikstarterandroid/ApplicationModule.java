package glossom.gzkikstarterandroid;

import android.app.Application;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zheng.gong on 2017/02/06.
 */
@Module
public final class ApplicationModule {
    private final Application application;
    public ApplicationModule(final @NonNull Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Environment provideEnvironment() {
        return Environment.builder().build();
    }


}
