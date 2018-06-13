package com.ptp.phamtanphat.intent0405;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSendString,btnSendNumber;
    public static final String Chuoi = "Chuoi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendString = findViewById(R.id.buttonIntentString);
        btnSendNumber = findViewById(R.id.buttonIntentNumber);

        btnSendString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "Chao main 2";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(Chuoi,text);
                startActivity(intent);
            }
        });
        btnSendNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 10;
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Number",number);
                startActivity(intent);
            }
        });
    }
}
