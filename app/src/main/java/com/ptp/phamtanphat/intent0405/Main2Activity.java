package com.ptp.phamtanphat.intent0405;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
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
        //Nhan du lieu dang String
//                Intent intent = getIntent();
//                String chuoi = intent.getStringExtra(MainActivity.Chuoi);
//                Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
        //Nhan du lieu dang Number
//        Intent intent = getIntent();
//        if (intent.hasExtra("Number")){
//            int number = intent.getIntExtra("Number",-1);
//            Toast.makeText(this, number + "", Toast.LENGTH_SHORT).show();
//        }
        //Nhan du lieu dang Arraylist
//        Intent intent = getIntent();
//        ArrayList<String> mangten = intent.getStringArrayListExtra("Arraylist");
//        Toast.makeText(this, mangten.get(0) + "" , Toast.LENGTH_SHORT).show();
//        Nhan du lieu dang Object
        Intent intent= getIntent();
        ArrayList<Nhanvien> nhanvien= intent.getParcelableArrayListExtra("Nhanvien");
        Toast.makeText(this, nhanvien.get(0).getTen(), Toast.LENGTH_SHORT).show();
    }
}
