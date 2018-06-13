package com.ptp.phamtanphat.intent0405;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        HashMap<String,String> mang = new HashMap<>();
//        mang.put("AAA","BBB");
//
//        Toast.makeText(this, mang.get("AAA"), Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String chuoi = intent.getStringExtra(MainActivity.Chuoi);
        Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
    }
}
