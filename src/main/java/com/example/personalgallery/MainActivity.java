package com.example.personalgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int index =0 ;

    int[] images = {R.drawable.dev_black ,
                    R.drawable.dev_christmas ,
                    R.drawable.dev_hodiie ,
                    R.drawable.dev_jacket ,
                    R.drawable.dev_yellow};

    public void NextClick(View v){
        index++;
        ((ImageView)findViewById(R.id.imageView)).setImageResource(images[index]);
        if(index == 4){
            ((Button)findViewById(R.id.button)).setEnabled(false);
            return;
        }
        ((Button)findViewById(R.id.button2)).setEnabled(true);
    }

    public void PrevClick(View v){
        index--;
        ((ImageView)findViewById(R.id.imageView)).setImageResource(images[index]);
        if(index == 0){
            ((Button)findViewById(R.id.button2)).setEnabled(false);
            return;
        }
        ((Button)findViewById(R.id.button)).setEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}