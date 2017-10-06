package org.arms.repository.sample.app;

import android.content.Context;

import org.arms.repository.ConfigRepository;
import org.arms.repository.di.module.RepositoryConfigModule;
import org.arms.repository.sample.BuildConfig;
import org.arms.repository.sample.model.Api;
import org.arms.repository.utils.RequestInterceptor;

import java.util.concurrent.TimeUnit;

/**
 * Created by ArmsTeam on 2017/10/3.
 */

public class RepositoryConfiguration implements ConfigRepository {
    @Override
    public void applyOptions(Context context, RepositoryConfigModule.Builder builder) {
        if (!BuildConfig.DEBUG) //Release 时,让框架不再打印 Http 请求和响应的信息
            builder.printHttpLogLevel(RequestInterceptor.Level.NONE);

        builder.baseUrl(Api.APP_DOMAIN)
                //自己自定义图片加载逻辑
                //                .imageLoaderStrategy(new CustomLoaderStrategy())
                // 这里提供一个全局处理 Http 请求和响应结果的处理类,可以比客户端提前一步拿到服务器返回的结果
                .globalHttpHandler(new GlobalHttpHandlerImpl())
                // 用来处理 rxjava 中发生的所有错误,rxjava 中发生的每个错误都会回调此接口
                // rxjava 必要要使用 ErrorHandleSubscriber (默认实现Subscriber的onError方法),此监听才生效
                .responseErrorListener(new ResponseErrorListenerImpl())
                //这里可以自己自定义配置Gson的参数
                .gsonConfiguration((context1, gsonBuilder) -> {
                    gsonBuilder
                            .serializeNulls()//支持序列化null的参数
                            .enableComplexMapKeySerialization();//支持将序列化key为object的map,默认只能序列化key为string的map
                })
                //这里可以自己自定义配置Retrofit的参数,甚至你可以替换系统配置好的okhttp对象
                .retrofitConfiguration((context1, retrofitBuilder) -> {
                    // 比如使用fastjson替代gson
                    // retrofitBuilder.addConverterFactory(FastJsonConverterFactory.create());
                })
                //这里可以自己自定义配置Okhttp的参数
                .okhttpConfiguration((context1, okhttpBuilder) -> {
                    //支持 Https
                    // okhttpBuilder.sslSocketFactory()
                    okhttpBuilder.writeTimeout(10, TimeUnit.SECONDS);
                });
    }
}
