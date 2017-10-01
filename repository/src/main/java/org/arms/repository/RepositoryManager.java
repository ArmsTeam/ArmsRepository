package org.arms.repository;

import android.app.Application;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Lazy;
import retrofit2.Retrofit;

/**
 * Created by ArmsTeam on 2017/9/28.
 * 数据管理层实现类
 */

@Singleton
public class RepositoryManager implements IRepositoryManager {
    private Application mApplication;
    private Lazy<Retrofit> mRetrofit;
    private final Map<String, Object> mRetrofitServiceCache = new HashMap<>();

    @Inject
    public RepositoryManager(Application application, Lazy<Retrofit> retrofit) {
        this.mApplication = application;
        this.mRetrofit = retrofit;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T obtainRetrofitService(Class<T> service) {
        T retrofitService;
        synchronized (mRetrofitServiceCache) {
            retrofitService = (T) mRetrofitServiceCache.get(service.getName());
            if (retrofitService == null) {
                retrofitService = mRetrofit.get().create(service);
                mRetrofitServiceCache.put(service.getName(), retrofitService);
            }
        }
        return retrofitService;
    }
}
