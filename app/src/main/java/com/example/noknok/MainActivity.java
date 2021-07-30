package com.example.noknok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cook_login,foodie_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cook_login = (Button)findViewById(R.id.login_as_co);
        foodie_login = (Button)findViewById(R.id.login_as_co);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cook_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cook_Login.class);
            }
        });
        foodie_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
            }
        });
    }
}