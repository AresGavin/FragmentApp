package com.example.app.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.app.R;
import com.example.app.presenter.MainPresenter;
import com.example.app.proxy.IMainView;

public class MainActivity extends AppCompatActivity implements IMainView{

    private ViewPager mViewPager;

    private MainPresenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.main_view_pager);
        initData();
    }

    private void initData() {
        presenter.initConfig(this.getSupportFragmentManager());
    }

    @Override
    public ViewPager getViewPager() {
        return mViewPager;
    }
}
