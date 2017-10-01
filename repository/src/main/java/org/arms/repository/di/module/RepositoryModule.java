package org.arms.repository.di.module;

import android.app.Application;

import org.arms.repository.IRepositoryManager;
import org.arms.repository.RepositoryManager;

import javax.inject.Singleton;

import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by ArmsTeam on 2017/9/28.
 * Dagger RepositoryModule
 */

@Module
public class RepositoryModule {
    private Application mApplication;

    public RepositoryModule(Application application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    IRepositoryManager provideRepositoryManager(Lazy<Retrofit> retrofit) {
        return new RepositoryManager(mApplication, retrofit);
    }
}
