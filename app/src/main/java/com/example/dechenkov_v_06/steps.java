package com.example.dechenkov_v_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class steps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.steps);
    }

    public void OnClick(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
        startActivity(i);
    }

}