package com.example.rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListAnggota extends AppCompatActivity {
    Button anggota1;
    Button anggota2;
    Button anggota3;
    Button anggota4;
    Button anggota5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_anggota);

        anggota1 = (Button)findViewById(R.id.btn_1);
        anggota2 = (Button)findViewById(R.id.btn_2);
        anggota3 = (Button)findViewById(R.id.btn_3);
        anggota4 = (Button)findViewById(R.id.btn_4);
        anggota5 = (Button)findViewById(R.id.btn_5);

        anggota1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota1.class);
                startActivity(intReg);
            }
        });

        anggota2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota2 .class);
                startActivity(intReg);
            }
        });

        anggota3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota3.class);
                startActivity(intReg);
            }
        });

        anggota4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota4.class);
                startActivity(intReg);
            }
        });

        anggota5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), Anggota5.class);
                startActivity(intReg);
            }
        });
    }
}