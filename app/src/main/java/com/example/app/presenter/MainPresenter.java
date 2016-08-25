package com.example.app.presenter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.app.proxy.IMainView;
import com.example.app.view.adapter.FragmentAdapter;
import com.example.app.view.fragment.FirstFragment;
import com.example.app.view.fragment.SecondFragment;
import com.example.app.view.fragment.ThirdFragment;

import java.util.LinkedList;

/**
 * 作者：Gavin 时间：2016/8/24.
 * 描述：
 */
public class MainPresenter {

    private IMainView mIMainView;

    public MainPresenter(IMainView iMainView){
        this.mIMainView = iMainView;
    }

    public void initConfig(FragmentManager manager) {
        // 设置Fragment
        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        ThirdFragment thirdFragment = new ThirdFragment();
        LinkedList<Fragment> fragments = new LinkedList<>();
        fragments.add(firstFragment);
        fragments.add(secondFragment);
        fragments.add(thirdFragment);
        mIMainView.getViewPager().setAdapter(new FragmentAdapter(manager, fragments));
    }
}
