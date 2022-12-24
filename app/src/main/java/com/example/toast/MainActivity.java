package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void toast(View view){
        EditText username=(EditText) findViewById(R.id.editTextTextPersonName);
        Log.i("button","It is working");
        Log.i("username",username.getText().toString());
        Toast.makeText(this,"Hello "+username.getText().toString(),Toast.LENGTH_SHORT).show();
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}