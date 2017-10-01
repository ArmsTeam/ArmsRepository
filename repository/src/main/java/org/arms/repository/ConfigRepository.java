package org.arms.repository;

import android.content.Context;

import org.arms.repository.di.module.RepositoryConfigModule;


/**
 * Created by ArmsTeam on 2017/9/28.
 * Repository 配置接口
 */

public interface ConfigRepository {
    /**
     * 使用{@link RepositoryConfigModule.Builder}给框架配置一些配置参数
     *
     * @param context: Context
     * @param builder: GlobalConfigModule.Builder
     */
    void applyOptions(Context context, RepositoryConfigModule.Builder builder);

}
