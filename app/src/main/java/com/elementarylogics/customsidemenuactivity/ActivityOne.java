package com.elementarylogics.customsidemenuactivity;

import android.os.Bundle;

public class ActivityOne extends SideMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_one);
        initDrawerLayout();
    }
}
