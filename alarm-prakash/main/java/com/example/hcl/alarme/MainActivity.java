package com.example.hcl.alarme;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartAlarm();
            }
        });
    }
    public void StartAlarm(){
        e1=findViewById(R.id.e1);
        String Time2=e1.getText().toString();
        int i2= Integer.parseInt(Time2);
        Intent i =new Intent(this,Manager.class);
        PendingIntent p= PendingIntent.getActivity(MainActivity.this,0,i,0);
        AlarmManager alarmManagerm=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManagerm.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()
                + (i2* 1000),p);
        Toast.makeText(this, "Alarm set in " + i + " seconds", Toast.LENGTH_LONG).show();
    }
}
