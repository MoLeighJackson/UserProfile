package com.example.moleigh.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView coolcatpic = (ImageView) findViewById(R.id.profile_picture);
        coolcatpic.setImageResource(R.drawable.coolcatpic);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Mo Leigh Jackson");
        name.setTextSize(15);
        name.setTextColor(Color.MAGENTA);

        TextView birthdate = (TextView) findViewById(R.id.birthday);
        birthdate.setText("December 28th");
        birthdate.setTextSize(15);
        birthdate.setTextColor(Color.RED);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("United States");
        country.setTextSize(15);
        country.setTextColor(Color.BLUE);
    }
}
