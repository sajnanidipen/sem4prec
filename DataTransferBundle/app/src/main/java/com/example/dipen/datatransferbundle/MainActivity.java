package com.example.dipen.datatransferbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.time);
        button = findViewById(R.id.);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Demo.a = editText.get().getText().toString();
                startActivity(new Intent(MainActivity.this, Welcome.class));