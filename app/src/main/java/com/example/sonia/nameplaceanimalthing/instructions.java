package com.example.sonia.nameplaceanimalthing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class instructions extends AppCompatActivity {
    TextView in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        in= (TextView)findViewById(R.id.tv1);
    }
}
