package com.example.mhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mhsBtn = (Button)findViewById(R.id.btnMahasiswa);
        mhsBtn.setOnClickListener(btnMahasiswa);

    }

    private  View.OnClickListener btnMahasiswa = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,tambahmhsActivity.class);
            startActivity(intent);
        }
    };

}
