package android.shravanti.com.dipen1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText et1;
    TextView tv3;
    ToggleButton tb1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        et1 = (EditText) findViewById(R.id.et1);
        tv3 = (TextView) findViewById(R.id.tv3);
        tb1 = (ToggleButton) findViewById(R.id.tb1);

        tb1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //String result = et1.getText().toString();
                //Toast.makeText(getApplicationContext(), "CLICK HOGAYA DOST", Toast.LENGTH_LONG).show();
                //tv3.setText(result);
                if(tb1.isChecked()){
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
