package org.arms.repository.di.component;

import org.arms.repository.IRepositoryManager;
import org.arms.repository.RepositoryInjector;
import org.arms.repository.di.module.ClientModule;
import org.arms.repository.di.module.RepositoryConfigModule;
import org.arms.repository.di.module.RepositoryModule;

import java.io.File;

import javax.inject.Singleton;

import dagger.Component;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import okhttp3.OkHttpClient;

/**
 * Created by ArmsTeam on 2017/9/28.
 * Dagger RepositoryComponent
 */

@Singleton
@Component(modules = {RepositoryModule.class, ClientModule.class, RepositoryConfigModule.class})
public interface RepositoryComponent {
    //用于管理网络请求层和数据库层
    IRepositoryManager repositoryManager();

    //Rxjava 错误处理管理类
    RxErrorHandler rxErrorHandler();

    //提供 OKHttpClient
    OkHttpClient okHttpClient();

    //提供缓存文件
    File cacheFile();

    void inject(RepositoryInjector repositoryInjector);
}
