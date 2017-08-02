package com.luorouterdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.mzule.activityrouter.annotation.Router;

/**
 * Created by Administrator on 2017/8/2.
 */
@Router("mainTo")
public class RouterMaintivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView jj = (TextView) findViewById(R.id.toDhange);
        jj.setText("我是RouterMaintivity");
    }
}
