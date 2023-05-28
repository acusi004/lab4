package com.example.lab4;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    public static String KEY_SANPHAM ="sanpham";
    public static String KEY_GIA ="giaSanPham";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button baoGia = findViewById(R.id.BaoGia);
        TextView sanpham = findViewById(R.id.SanPham);
        EditText nhapGia = findViewById(R.id.NhapGia);

        // set san pham tu acticity 3
        Intent intent = getIntent();
        String SP = intent.getStringExtra(KEY_SANPHAM);
        sanpham.setText(SP);

        baoGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nhapgia = nhapGia.getText().toString();
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                // gui gia cho activity 3
                intent.putExtra(KEY_GIA, Nhapgia);
                startActivity(intent);
            }
        });


    }
}