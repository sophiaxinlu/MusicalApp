package com.sophiaxinlu.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String title = "This is " + intent.getStringExtra("detailName") + " detail view";

        TextView pageTitleView = (TextView) findViewById(R.id.pageTitle);
        pageTitleView.setText(title);


        Button nowPlayingBtn = (Button) findViewById(R.id.nowPlaying);
        Button artistIntroBtn = (Button) findViewById(R.id.artistIntro);



        View.OnClickListener nowPlayingBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        };


        View.OnClickListener artistIntroBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfoListActivity.class);
                startActivity(intent);
            }
        };

        nowPlayingBtn.setOnClickListener(nowPlayingBtnListener);
        artistIntroBtn.setOnClickListener(artistIntroBtnListener);
    }

}
