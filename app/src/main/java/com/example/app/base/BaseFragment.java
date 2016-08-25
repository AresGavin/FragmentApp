package com.example.app.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：Gavin 时间：2016/8/24.
 * 描述：
 */
public abstract class BaseFragment extends Fragment {

    protected View mView;

    protected boolean isViewCreated;// 初始化是否完成

    protected boolean isLoadDataCompleted;// 加载数据是否完成

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(initLayout(), container, false);
            initViews(mView);
        } else {
            ViewGroup mGroup = (ViewGroup) mView.getParent();
            if (mGroup != null) {
                mGroup.removeView(mView);
            }
        }
        isViewCreated = true;
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getUserVisibleHint()) {
            isLoadDataCompleted = true;
            loadData();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && isViewCreated && !isLoadDataCompleted) {
            isLoadDataCompleted = true;
            loadData();
        }
    }

    protected abstract int initLayout();

    protected abstract void initViews(View view);

    protected abstract void loadData();
}
