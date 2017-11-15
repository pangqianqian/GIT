package com.example.pangqianqian.meow.cat_cirlce;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;

import com.example.pangqianqian.meow.R;

/**
 * Created by pangqianqian on 2017/11/15.
 */

public class MyBaseAdapter extends BaseAdapter {

    private String[] names;

    private int[] icons;

    public String[] getNames(){
        return names;
    }

    public int[] getIcons(){
        return icons;
    }

    public void setNames(String[] name){
        int length=name.length;
        for(int i=0;i<length;i++)
        {
            names[i]=name[i];
        }
    }

    public void setIcons(int[] icon)
    {
        int length=icon.length;
        for(int i=0;i<length;i++)
        {
            icons[i]=icon[i];
        }
    }

    //得到item的总数
    @Override
    public int getCount() {
        //返回ListView Item条目的总数
        return names.length;
    }

    //得到item代表的对象
    @Override
    public Object getItem(int position) {
        return names[position];
    }

    //得到item的id
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //将list_item.xml文件找出来并转换成vi对象
        View view=View.inflate(null, R.layout.cat_circle_list_item,null);
        TextView mTextView=(TextView) view.findViewById(R.id.item_tv);
        mTextView.setText(names[position]);
        ImageView imageView =(ImageView) view.findViewById(R.id.item_iamge);
        imageView.setBackgroundResource(icons[position]);
        return view;
    }
}
