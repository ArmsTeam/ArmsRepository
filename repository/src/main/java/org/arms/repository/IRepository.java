package org.arms.repository;


import org.arms.repository.di.component.RepositoryComponent;
import org.arms.repository.di.module.RepositoryModule;

/**
 * Created by ArmsTeam on 2017/9/28.
 * Application 继承该接口，就可以具有 RepositoryComponent 提供的方法。
 */

public interface IRepository {
    /**
     * Description: 获得全局 RepositoryComponent
     *
     * @return RepositoryComponent
     */
    RepositoryComponent getRepositoryComponent();

    /**
     * Description: 获得全局 RepositoryModule 重用
     *
     * @return RepositoryModule
     */
    RepositoryModule getRepositoryModule();

}
