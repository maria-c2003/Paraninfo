package com.ifsc.oiiieeee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o);
    }

    public void cliiique(View view){
        Intent i =new Intent(this, AActivity.class);
        startActivity(i);
    }
}