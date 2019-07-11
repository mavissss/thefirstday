package com.bytedance.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Switch;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Switch mSwitch=(Switch)findViewById(R.id.switch1);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, final boolean isChecked) {

                    Button btn1=(Button) findViewById(R.id.btn1);
                    btn1.setOnClickListener(new View.OnClickListener()
                    {
                        @Override

                        public void onClick(View v){
                            if(!isChecked){

                                EditText editText1=(EditText)findViewById(R.id.editText);
                                TextView tv1= (TextView) findViewById(R.id.tv1);
                                String inputtext=editText1.getText().toString();
                                tv1.setText(inputtext);

                            }
                            else{


                            }

                        }
                    });





            }
        });

        Log.d(TAG, "MainActivity");
    }

}


