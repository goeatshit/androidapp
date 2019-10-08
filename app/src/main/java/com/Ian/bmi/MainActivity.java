package com.Ian.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edWeight;
    EditText edHeight ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);

    }
    public void bmi (View view){
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        System.out.println(bmi);
        Log.d("mainActivity", "bmi: "+bmi);
    }

}
