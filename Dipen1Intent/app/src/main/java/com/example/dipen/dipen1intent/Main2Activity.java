package com.example.dipen.dipen1intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = findViewById(R.id.tv1);
        Bundle b = getIntent().getExtras();
        String str1 = b.getString("name").toString();
        String str2 = b.getString("email").toString();
        String str3 = b.getString("pass").toString();
        String str4 = b.getString("phn").toString();
        text1.setText("Name: "+str1 + "\n" +
                "Email: "+str2 + "\n" +
                "Password: "+str3 + "\n"+
                "Phone" + str4 + "\n");




        
    }
}
