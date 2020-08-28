package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();

    Button button;
    TextView text;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                num = rand.nextInt(6);

                if(num != 5){
                    text.setText("Test 1");
                }
                else{
                    text.setText("Test 2");
                }

            }
        });
    }
}
