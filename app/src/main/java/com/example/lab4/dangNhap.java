package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class dangNhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        EditText uname = findViewById(R.id.UserName);
        EditText password = findViewById(R.id.PassWord);
        Button dnhap = findViewById(R.id.btnDangNhap);

        Bundle bundle = getIntent().getBundleExtra("data");
        String username = bundle.getString("user");
        String Password = bundle.getString("pass");

        uname.setText(username);
        password.setText(Password);

    }
}