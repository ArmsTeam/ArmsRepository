package org.arms.repository.sample.di.component;

import org.arms.repository.di.module.RepositoryModule;
import org.arms.repository.sample.app.MainApp;

import dagger.Component;

/**
 * Created by ArmsTeam on 2017/10/3.
 * Dagger AppComponent
 */

@Component(modules = RepositoryModule.class)
public interface AppComponent {
    void inject(MainApp mainApp);
}
