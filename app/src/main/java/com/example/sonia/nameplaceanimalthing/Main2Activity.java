package com.example.sonia.nameplaceanimalthing;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

;
import android.view.View;
import android.widget.Button;



public class Main2Activity extends AppCompatActivity {
    Button sing, lev2, lev3, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        sing = (Button) findViewById(R.id.butt3);
        lev2 = (Button) findViewById(R.id.butt2);
        lev3 = (Button) findViewById(R.id.butt3act);


        sing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View o) {
                Intent j = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(j);
            }
        });
        lev2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View o) {
                Intent j = new Intent(getApplicationContext(), lev2.class);
                startActivity(j);
            }
        });
        lev3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View o) {
                Intent j = new Intent(getApplicationContext(), lev3.class);
                startActivity(j);
            }
        });








    }
}







