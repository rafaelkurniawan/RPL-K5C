package com.example.rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anggota2 extends AppCompatActivity {
    Button list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggota2);

        list = (Button)findViewById(R.id.list5);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intReg = new Intent(getApplicationContext(), ListAnggota.class);
                startActivity(intReg);
            }
        });
    }
}