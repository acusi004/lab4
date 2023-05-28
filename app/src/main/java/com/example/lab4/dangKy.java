package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dangKy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        EditText Uname = findViewById(R.id.UserName);
        EditText Pword = findViewById(R.id.PassWord);
        EditText CfPass = findViewById(R.id.PassWordConFirm);
        Button Dky = findViewById(R.id.btnDangKy);

        Dky.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = Uname.getText().toString();
                String pass = Pword.getText().toString();
                String cfpass = CfPass.getText().toString();

                if(name == null || name.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "can nhap username", Toast.LENGTH_SHORT).show();
                } else if (pass == null || pass.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "can nhap password", Toast.LENGTH_SHORT).show();
                } else if (cfpass == null || cfpass.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "can nhap lai passwrd", Toast.LENGTH_SHORT).show();
                }else if (! cfpass.equals(pass)){
                    Toast.makeText(getApplicationContext(), "password nhap lai chua dung", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(dangKy.this, dangNhap.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("user", name);
                    bundle.putString("pass", pass);
                    bundle.putString("cf", cfpass);
                    intent.putExtra("data", bundle);
                    startActivity(intent);

                }
            }
        });

    }
}