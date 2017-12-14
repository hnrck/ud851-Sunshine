package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        final TextView weatherTextView = (TextView)findViewById(R.id.tv_weather);

        Intent thisIntent = this.getIntent();
        if (thisIntent.hasExtra(MainActivity.WEATHER_EXTRA)) {
            final String weather = thisIntent.getStringExtra(MainActivity.WEATHER_EXTRA);
            weatherTextView.setText(weather);
        }
    }
}