package com.example.hcl.exam_prabhat_lal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();


        String str1 = b.getString("nm").toString();
        String str2 = b.getString("em").toString();
        String str3 = b.getString("fd").toString();
        String str4 = b.getString("cb").toString();
        String str5 = b.getString("spin").toString();
        tv1.setText("Name: "+str1 + "\n" +
                "Email: "+str2 + "\n" +
                "Feedback: "+str3 + "\n"+
                "Checked? " + str4 + "\n"+
                "Selected - "+str5);
    }
}
