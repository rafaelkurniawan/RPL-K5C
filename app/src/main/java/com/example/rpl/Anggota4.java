package com.example.rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anggota4 extends AppCompatActivity {

    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota4);

        kembali = (Button) findViewById(R.id.kembali4);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), ListAnggota.class);
                startActivity(intReg);
            }
        });
    }
}
