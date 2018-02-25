package com.example.dekstop_martha.imadedwimarthayana_1202150061_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by DEKSTOP-MARTHA on 2/25/2018.
 */

public class Splashscreen extends AppCompatActivity {
    private int SplashInterval = 3000; // kecepatan perpindahan 3 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
//      Menghinlangkan head atau navigasi pada SplashScreen Activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //berpindah dari splashscreen ke menulist utama
                startActivity(new Intent(Splashscreen.this, Login.class));
                //menampilkan toast
                Toast.makeText(Splashscreen.this, "WELCOME", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashInterval);
    }
}
