package com.e.myjob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Primer Programa con don gabu
        //Choy haces esto
        Toast.makeText(this, "Hola desde aqui", Toast.LENGTH_SHORT).show();
    }
}
