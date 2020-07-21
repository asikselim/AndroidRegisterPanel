package com.example.chatty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class register extends AppCompatActivity {


    private Toolbar actionbarregister;

    public void  init(){
        actionbarregister = (Toolbar) findViewById(R.id.actionbarregister);
        setSupportActionBar(actionbarregister);
        getSupportActionBar().setTitle("Yeni Hesap Oluştur");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }
}