package com.elementarylogics.customsidemenuactivity;

import android.os.Bundle;

public class ActivityTwo extends SideMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_two);
        initDrawerLayout();
    }
}
