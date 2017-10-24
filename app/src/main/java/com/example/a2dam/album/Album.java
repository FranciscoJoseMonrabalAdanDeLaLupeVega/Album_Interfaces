package com.example.a2dam.album;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Album extends AppCompatActivity implements View.OnClickListener {

    private TextView album1;
    private TextView album2;
    private TextView album3;
    private TextView album4;
    private GridLayout fotosLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        album1 = (TextView) findViewById(R.id.album);
        album2 = (TextView) findViewById(R.id.album2);
        album3 = (TextView) findViewById(R.id.album3);
        album4 = (TextView) findViewById(R.id.album4);
        fotosLayout = (GridLayout) findViewById(R.id.fotosLayout);

        album1.setOnClickListener(this);
        album2.setOnClickListener(this);
        album3.setOnClickListener(this);
        album4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this, "Falla el if", Toast.LENGTH_SHORT).show();

        if (v.getId() == R.id.album) {

            fotosLayout.setBackgroundColor(1);
            Toast.makeText(this, "Has pulsado album 1", Toast.LENGTH_SHORT).show();
            Log.d("Mensaje:", "Has pulsado album 1");

            for (int i = 0; i < 10; i++) {


            }
        }

        if (v.getId() == album2.getId()) {


        }
        if (v.getId() == album3.getId()) {


        }
        if (v.getId() == album4.getId()) {


        }
    }
}
