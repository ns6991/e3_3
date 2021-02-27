package com.example.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int counter =0;
    public void clicked(View view) {

        Button button = (Button)findViewById(R.id.button);
        counter++;
        button.setText("This is a click number: " + counter);

        if(counter==7){
            button.setText("Enough to click. Go to new start!");
            counter=0;
        }

    }
}