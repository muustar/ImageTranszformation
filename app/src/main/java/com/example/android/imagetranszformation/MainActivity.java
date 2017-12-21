package com.example.android.imagetranszformation;

import android.media.Image;
import android.media.ImageWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bart elhejezése a képernyőn kívül bal oldalra
        /**
         * ekkor Bart nincs a képben tehát rá nem is tudunk kattintatni, így az onClick esemény
         * azért fut le mert Homérra kattintunk rá (persze ő épp nem látható)
         */
        ImageView bart = (ImageView) findViewById(R.id.bart_img);
        bart.animate().translationXBy(-2000);

    }

    public void esemeny(View view){
        ImageView bart = (ImageView) findViewById(R.id.bart_img);
        ImageView homer = (ImageView) findViewById(R.id.homer_img);

        // Bart és Homér átteccővé válik és vissza
        /*
        if (bart.getAlpha()==1){
            bart.animate().alpha(0f).setDuration(3000);
        } else {
            bart.animate().alpha(1f).setDuration(3000);
        }

        if (homer.getAlpha()==1){
            homer.animate().alpha(0f).setDuration(3000);
        } else {
            homer.animate().alpha(1f).setDuration(3000);
        }
        */


        // Bart 2000 ponttal lecsúszik a képernyőn
        /*
        bart.animate().translationYBy(2000).setDuration(3000);
        */

        // Bart balról becsúszik
        bart.animate().translationXBy(2000).setDuration(3000);


    }
}
