package com.example.davenliu.beggarsbgone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    public void moveFind(View view){
        Intent i = new Intent(this, FInd.class);
        startActivity(i);
    }

    public void moveReport(View view){
        Intent i = new Intent(this, Report.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
