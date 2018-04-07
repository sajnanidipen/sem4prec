package com.example.dipen.dipen1intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email,pass,phn;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.etname);
        email = findViewById(R.id.etemail);
        pass = findViewById(R.id.etpass);
        phn = findViewById(R.id.etphn);
        submit = findViewById(R.id.btn1);

        Toast.makeText(getApplicationContext(), "Simple Toast", Toast.LENGTH_LONG).show();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
//
//                i.putExtra("Name:",name.getText().toString());
//                i.putExtra("Email:",email.getText().toString());
//                i.putExtra("Password:",pass.getText().toString());
//                i.putExtra("Phone:",phn.getText());

                Toast.makeText(MainActivity.this, "Data sent..", Toast.LENGTH_SHORT).show();
                startActivity(i);


                /*String result = name.getText().toString();
                Toast.makeText(getApplicationContext(), "CLICK HOGAYA DOST", Toast.LENGTH_LONG).show();
                submit.setText(result);*/
            }
        });


    }
}
