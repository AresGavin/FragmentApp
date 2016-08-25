package com.example.app.view.fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.app.R;
import com.example.app.base.BaseFragment;

/**
 * 作者：Gavin 时间：2016/8/24.
 * 描述：
 */
public class ThirdFragment extends BaseFragment {

    private TextView mText;

    @Override
    protected int initLayout() {
        return R.layout.fragment_content;
    }

    @Override
    protected void initViews(View view) {
        mText = (TextView) view.findViewById(R.id.text_number);
    }

    @Override
    protected void loadData() {
        mText.setText("" + 3);
        Log.i("TAG----ThirdFragment", "ThirdFragment加载数据");
    }
}
