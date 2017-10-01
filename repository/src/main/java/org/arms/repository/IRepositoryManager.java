package org.arms.repository;

/**
 * Created by ArmsTeam on 2017/9/28.
 * 数据管理层接口
 */

public interface IRepositoryManager {
    //懒加载获取 Retrofit Service
    <T> T obtainRetrofitService(Class<T> service);
}
