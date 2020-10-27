package com.gbc.laaftogether;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button login,register;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        Intent intent = getIntent();
//
//        message = intent.getStringExtra("clickevent");


        if(message.equals("userclicked") ){
            Toast t1 = Toast.makeText(getApplicationContext(),"User has clicked",Toast.LENGTH_SHORT);
            t1.show();
        }

        if(message.equals("specialistclicked")){
            Toast t2 = Toast.makeText(getApplicationContext(),"Specialist has clicked",Toast.LENGTH_SHORT);
            t2.show();
        }



        login = (Button)findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        register = (Button)findViewById(R.id.registerbtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}