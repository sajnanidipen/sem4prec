package com.example.hcl.exam_prabhat_lal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Spinner sp;
    EditText etnm, etemail, etfd;
    CheckBox cb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        sp = findViewById(R.id.spinner);
        etnm = findViewById(R.id.etname);
        etemail = findViewById(R.id.etmail);
        etfd = findViewById(R.id.etfdback);
        cb1 = findViewById(R.id.checkBox);
        final String arr[] = {"Praise", "Praise2", "Praise3"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, arr);
        sp.setAdapter(adapter);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                String st, st2;
                st2 = adapter.getItem(sp.getSelectedItemPosition());
                Toast.makeText(MainActivity.this,"spinner item: "+ st2, Toast.LENGTH_SHORT).show();




                if(cb1.isChecked()){
                    st = "You will get email notifications";
                }
                else{
                    st = "Not Checked!";
                }
                i.putExtra("nm",etnm.getText().toString());
                i.putExtra("em",etemail.getText().toString());
                i.putExtra("fd",etfd.getText().toString());
                i.putExtra("cb",st);
                i.putExtra("spin",st2);

                Toast.makeText(MainActivity.this, "Data sent..", Toast.LENGTH_SHORT).show();
                startActivity(i);



            }

        });
//        public void

    }
}
