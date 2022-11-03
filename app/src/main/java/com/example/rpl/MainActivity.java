package com.example.rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next;
    TextView nama_kelompok;
    TextView anggota1;
    TextView anggota2;
    TextView anggota3;
    TextView anggota4;
    TextView anggota5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (Button)findViewById(R.id.button_next);
        nama_kelompok = (TextView) findViewById(R.id.nama_kelompok);
        anggota1 = (TextView) findViewById(R.id.anggota_1);
        anggota2 = (TextView) findViewById(R.id.anggota_2);
        anggota3 = (TextView) findViewById(R.id.anggota_3);
        anggota4 = (TextView) findViewById(R.id.anggota_4);
        anggota5 = (TextView) findViewById(R.id.anggota_5);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), ListAnggota.class);
                startActivity(intReg);
            }
        });

    }
}