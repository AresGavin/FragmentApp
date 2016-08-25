package com.example.app.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.LinkedList;

/**
 * 作者：Gavin 时间：2016/8/24.
 * 描述：
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private LinkedList<Fragment> mFragments;

    public FragmentAdapter(FragmentManager manager, LinkedList<Fragment> fragments) {
        super(manager);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments == null ? 0 : mFragments.size();
    }
}
