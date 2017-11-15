package com.example.pangqianqian.meow.cat_cirlce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import com.example.pangqianqian.meow.R;

public class cat_circle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_circle);

        TabHost tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();

//        //动态载入XML，而不需要Activity
//        LayoutInflater i=LayoutInflater.from(this);
//        i.inflate(R.layout.commend, tabHost.getTabContentView());
//        i.inflate(R.layout.up_to_date, tabHost.getTabContentView());
//        i.inflate(R.layout.nearby, tabHost.getTabContentView());
//        i.inflate(R.layout.focus, tabHost.getTabContentView());

        tabHost.addTab(tabHost.newTabSpec("推荐").setIndicator("推荐").setContent(new Intent(this,cat_circle_commend.class)));
        tabHost.addTab(tabHost.newTabSpec("最新").setIndicator("最新").setContent(new Intent(this,cat_circle_new.class)));
        tabHost.addTab(tabHost.newTabSpec("附近").setIndicator("附近").setContent(new Intent(this,cat_circle_nearby.class)));
        tabHost.addTab(tabHost.newTabSpec("关注").setIndicator("关注").setContent(new Intent(this,cat_circle_focus.class)));

    }
}
