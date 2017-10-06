package org.arms.repository.sample.model.service;

import org.arms.repository.sample.model.entry.Org;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by ArmsTeam on 2017/10/5.
 */

public interface ArmsService {
    /**
     * https://api.github.com/orgs/armsteam
     */
    @GET("orgs/armsteam")
    Observable<Org> getArmsTeam();
}
