package com.example.android.lab07_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private TextView m_tv_main_activity_message;
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        init();
    }

    private void init() {
        m_tv_main_activity_message=(TextView)findViewById(R.id.tv_main_activity_message);
        initBackgroundColor();
    }

    private void initBackgroundColor() {
        color = getIntent().getIntExtra(ColorPickerActivity.BUNDLE_KEY_COLOR_INT,-1);
        if(color==-1){
            return;
        }
        m_tv_main_activity_message.setBackgroundColor(color);
    }

    public void main(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);

//        finish();

        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Removes other Activities from stack

//        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);

        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }

}
