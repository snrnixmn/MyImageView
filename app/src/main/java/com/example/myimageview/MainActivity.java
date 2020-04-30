package com.example.myimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDay1;
    ImageView ivDay2;
    ImageView ivDay3;
    ImageView ivDay4;
    ImageView ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the ImageView obj and assign to ivDay2
        ivDay1 = (ImageView) findViewById(R.id.imageView1);
        // set the image
        ivDay1.setImageResource(R.drawable.day1);

        // get the ImageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        // set the image
        ivDay2.setImageResource(R.drawable.day2);

        // get the ImageView obj and assign to ivDay2
        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        // set the image
        ivDay3.setImageResource(R.drawable.day3);

        // get the ImageView obj and assign to ivDay2
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        // set the image
        ivDay4.setImageResource(R.drawable.day4);

        // get the ImageView obj and assign to ivDay2
        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        // set the image
        ivDay5.setImageResource(R.drawable.day5);
    }
}
