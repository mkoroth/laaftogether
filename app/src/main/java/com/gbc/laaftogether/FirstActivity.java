package com.gbc.laaftogether;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button user,specialist;
    String message = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        user = (Button)findViewById(R.id.userbtn);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = "userclicked";
                startHomepage();

            }
        });
        specialist = (Button)findViewById(R.id.specialistbtn);
        specialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = "specialistclicked";
                startHomepage();
            }
        });
    }
    public void startHomepage(){
//        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
//        intent.putExtra("clickevent",message);
//        startActivity(intent);
    }
}