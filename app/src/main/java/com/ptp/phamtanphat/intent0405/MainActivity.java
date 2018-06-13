package com.ptp.phamtanphat.intent0405;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnSendString,btnSendNumber,btnSendArraylist,btnSendObject;
    public static final String Chuoi = "Chuoi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendString = findViewById(R.id.buttonIntentString);
        btnSendNumber = findViewById(R.id.buttonIntentNumber);
        btnSendArraylist = findViewById(R.id.buttonIntentArraylist);
        btnSendObject = findViewById(R.id.buttonIntentObject);

        btnSendString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "Chao main 2";
                SendData(Chuoi,text);
            }
        });
        btnSendNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 10;
                SendData("Number",number);
            }
        });
        btnSendArraylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> mangten = new ArrayList<>();
                mangten.add("Nguyen Van A");
                mangten.add("Nguyen Van B");
                mangten.add("Nguyen Van C");

                SendData("Arraylist",mangten);
            }
        });
        btnSendObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Nhanvien> mangnhanvien = new ArrayList<>();
                mangnhanvien.add(new Nhanvien("Nguyen Van A" , "20"));
                mangnhanvien.add(new Nhanvien("Nguyen Van B" , "25"));

                Nhanvien nhanvien = new Nhanvien("Nguyen Van C","30");
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Nhanvien", nhanvien);
                startActivity(intent);
            }
        });
    }
    private <T> void SendData(String key, T data){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (data instanceof String){
            intent.putExtra(key,(String) data);
        }
        if (data instanceof Integer){
            intent.putExtra(key,(Integer) data);
        }
        if (data instanceof ArrayList<?>){
            if (data instanceof String){
                intent.putExtra(key,(ArrayList<String>) data);
            }
        }

        startActivity(intent);
    }
}
