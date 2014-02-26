package com.example.BookExchange;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Phillip on 2/25/14.
 */
public class left_tab extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Left tab");
        setContentView(textview);
    }
}

