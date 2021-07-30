package com.example.noknok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Cook_Login extends AppCompatActivity {
    TextView sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook_login);
        sign_up = (TextView)findViewById(R.id.sign_up_here);
    }
}