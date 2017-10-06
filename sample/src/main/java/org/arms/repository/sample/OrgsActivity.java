package org.arms.repository.sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.arms.repository.sample.model.entry.Org;
import org.arms.repository.sample.model.service.ArmsService;
import org.arms.repository.utils.RepositoryUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import timber.log.Timber;

public class OrgsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            RepositoryUtils.INSTANCE.obtainRepositoryComponent(this)
                    .repositoryManager()
                    .obtainRetrofitService(ArmsService.class)
                    .getArmsTeam()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new ErrorHandleSubscriber<Org>
                            (RepositoryUtils.INSTANCE.obtainRepositoryComponent(this).rxErrorHandler()) {
                        @Override
                        public void onNext(@NonNull Org org) {
                            Timber.d("onNext: " + org.getHtmlUrl());
                            ((TextView) findViewById(R.id.result)).setText(org.getHtmlUrl());
                        }
                    });

        });
    }

}
