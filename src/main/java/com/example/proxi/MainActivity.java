package com.example.proxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayImage(View view) {
        if (bClick == false) {
            ImageView img = findViewById(R.id.image1);
            img.setVisibility(View.VISIBLE);
            bClick = true;
        }else if(bClick == true){
            ImageView img = findViewById(R.id.image1);
            img.setVisibility(View.INVISIBLE);
            bClick = false;
        }
    }
}
