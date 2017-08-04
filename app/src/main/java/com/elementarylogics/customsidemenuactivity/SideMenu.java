package com.elementarylogics.customsidemenuactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Windows 10 on 4/28/2016.
 */
public class SideMenu extends FragmentActivity {

    protected DrawerLayout mDrawerLayout;
    private RelativeLayout rl_main_screen;
    RelativeLayout rl_slider_menu;

    private ActionBarDrawerToggle mDrawerToggle;
    protected void initDrawerLayout(){
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setScrimColor(Color.parseColor("#A447C469"));
//        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        rl_slider_menu=(RelativeLayout)findViewById(R.id.rl_slider_menu);
        rl_main_screen=(RelativeLayout)findViewById(R.id.rl_main_screen);
        //To show navigation view on full screen
        /*Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        ViewGroup.LayoutParams params=rl_slider_menu.getLayoutParams();
        params.width=size.x;
        rl_slider_menu.setLayoutParams(params);*/
        //end To show navigation view on full screen

        //move contents layout
        mDrawerToggle = new ActionBarDrawerToggle(SideMenu.this, mDrawerLayout, 0, 0)
        {
            @SuppressLint("NewApi")
            public void onDrawerSlide(View drawerView, float slideOffset)
            {
                rl_main_screen.setX(drawerView.getWidth() * slideOffset);
            }
        };
        mDrawerLayout.addDrawerListener(mDrawerToggle);
        //end move contents layout
    }

    public void clickedSideMenuOption(View view){
        String option_tag=view.getTag().toString();
        if (option_tag.equalsIgnoreCase("1")){
            startActivity(new Intent(this,ActivityOne.class));
            finish();
        }else if (option_tag.equalsIgnoreCase("2")){
            startActivity(new Intent(this,ActivityTwo.class));
            finish();
        }

//        closeSideMenu(view);
    }
    public void closeSideMenu(View view) {
        mDrawerLayout.closeDrawer(rl_slider_menu);
    }

    public void openSideMenu(View view) {

        mDrawerLayout.openDrawer(rl_slider_menu);
    }
}
