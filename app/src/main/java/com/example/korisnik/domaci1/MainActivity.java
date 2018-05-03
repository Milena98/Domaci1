package com.example.korisnik.domaci1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Start = (Button) findViewById(R.id.btnopt1_a);
        Start.setOnClickListener(new OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "First Toast Ever" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
