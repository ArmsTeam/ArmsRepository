package org.arms.repository.sample.app;

import android.app.Application;
import android.content.Context;

import org.arms.repository.IRepository;
import org.arms.repository.RepositoryInjector;
import org.arms.repository.di.component.RepositoryComponent;
import org.arms.repository.di.module.RepositoryModule;
import org.arms.repository.sample.di.component.DaggerAppComponent;

import timber.log.Timber;

/**
 * Created by ArmsTeam on 2017/10/3.
 */

public class MainApp extends Application implements IRepository {
    private RepositoryInjector mRepositoryInjector;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        if (mRepositoryInjector == null)
            mRepositoryInjector = new RepositoryInjector(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        DaggerAppComponent.builder()
                .build()
                .inject(this);
        mRepositoryInjector.onCreate(this);
    }

    @Override
    public RepositoryComponent getRepositoryComponent() {
        return mRepositoryInjector.getRepositoryComponent();
    }

    @Override
    public RepositoryModule getRepositoryModule() {
        return mRepositoryInjector.getRepositoryModule();
    }
}
