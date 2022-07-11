package com.example.schoolmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.schoolmanagementsystem.Admin.AdminExamsActivity;
import com.example.schoolmanagementsystem.signin.LoginActivity;


public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
         Thread td = new Thread(){

             public void run(){
                 try{
                     sleep(5000);  //Waiting Time

                 }catch (Exception ex){
                     ex.printStackTrace();

                 }
                 finally {
                     Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                     startActivity(intent);
                     finish();

                 }
             }
         }; td.start();



    }


}