package com.example.lab4;

import static android.content.ContentValues.TAG;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    public static String KEY_SANPHAM ="sanpham";

    public static String KEY_GIA ="giaSanPham";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView giaSanPham = findViewById(R.id.giaSanPham);

        EditText nhapSp =  findViewById(R.id.NhapSanPham);
        Button GuiSp =  findViewById(R.id.GuiSp);
        // set gia tu activity 4
        Intent intent = getIntent();
        String Gia = intent.getStringExtra(KEY_GIA);
        giaSanPham.setText(Gia);


        GuiSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sanpham = nhapSp.getText().toString();
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                // gui san pham cho activity 4
                intent.putExtra(KEY_SANPHAM, sanpham);
                startActivity(intent);
            }
        });


    }
}