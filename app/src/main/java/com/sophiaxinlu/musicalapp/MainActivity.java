package com.sophiaxinlu.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nowPlayingBtn = (Button) findViewById(R.id.nowPlaying);
        TextView album1View = (TextView) findViewById(R.id.album1);
        TextView album2View = (TextView) findViewById(R.id.album2);
        TextView album3View = (TextView) findViewById(R.id.album3);
        TextView album4View = (TextView) findViewById(R.id.album4);
        TextView album5View = (TextView) findViewById(R.id.album5);
        TextView album6View = (TextView) findViewById(R.id.album6);

        View.OnClickListener nowPlayingBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        };


        View.OnClickListener detailBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                String text = ((TextView)v).getText().toString();
                intent.putExtra("detailName", text);
                startActivity(intent);
            }
        };

        nowPlayingBtn.setOnClickListener(nowPlayingBtnListener);

        album1View.setOnClickListener(detailBtnListener);
        album2View.setOnClickListener(detailBtnListener);
        album3View.setOnClickListener(detailBtnListener);
        album4View.setOnClickListener(detailBtnListener);
        album5View.setOnClickListener(detailBtnListener);
        album6View.setOnClickListener(detailBtnListener);
    }
}
