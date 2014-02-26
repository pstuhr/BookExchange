package com.example.BookExchange;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;

/**
 * Created by Phillip on 2/23/14.
 */
public class BookExchange extends TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources resources = getResources();
        TabHost tabHost = getTabHost();

        // Left tab
        Intent intentLeft = new Intent().setClass(this, left_tab.class);
        TabHost.TabSpec tabSpecLeft = tabHost
                .newTabSpec("Left")
                .setIndicator("", resources.getDrawable(R.drawable.left_tab))
                .setContent(intentLeft);

        //Middle Tab
        Intent intentMiddle = new Intent().setClass(this, middle_tab.class);
        TabHost.TabSpec tabSpecMiddle = tabHost
                .newTabSpec("Middle")
                .setIndicator("",resources.getDrawable(R.drawable.middle_tab))
                .setContent(intentMiddle);

        //Right Tab
        Intent intentRight = new Intent().setClass(this, right_tab.class);
        TabHost.TabSpec tabSpecRight = tabHost
                .newTabSpec("Right")
                .setIndicator("", resources.getDrawable(R.drawable.right_tab))
                .setContent(intentRight);

        //Add Tabs
        tabHost.addTab(tabSpecLeft);
        tabHost.addTab(tabSpecMiddle);
        tabHost.addTab(tabSpecRight);

        //Set Default
        tabHost.setCurrentTab(0);
    }

//    private void createTab(String string, Class tabClass, Drawable tab) {
//        Resources resources = getResources();
//        TabHost tabHost = getTabHost();
//        Intent intent = new Intent().setClass(this, tabClass);
//        TabHost.TabSpec tabSpecRight = tabHost
//                .newTabSpec(string)
//                .setIndicator("", resources.getDrawable(R.drawable.tab))
//                .setContent(intent);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bookexchange_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void openSearch() {
        Toast.makeText(this, "Search button pressed", Toast.LENGTH_SHORT).show();
    }

    private void openSettings() {
        Toast.makeText(this, "Settings button pressed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}