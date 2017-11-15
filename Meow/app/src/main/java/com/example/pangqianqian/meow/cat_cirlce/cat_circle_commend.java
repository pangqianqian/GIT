package com.example.pangqianqian.meow.cat_cirlce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.pangqianqian.meow.R;

/**
 * Created by pangqianqian on 2017/11/15.
 */

public class cat_circle_commend extends Activity {

    private ListView mListView;

    //需要适配的数据
    private String[] names={"詹萍"};

    //需要适配的图片
    private int[] icons={R.drawable.zp};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_circle_list);
        //初始化ListView控件
        mListView=(ListView)findViewById(R.id.lv);
        //创建一个Adapter的实例
        MyBaseAdapter mAdapter =new MyBaseAdapter();
        mAdapter.setNames(names);
        mAdapter.setIcons(icons);
        //设置Adapter
        mListView.setAdapter(mAdapter);
    }

}
