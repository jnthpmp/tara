package com.example.mhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class tambahmhsActivity extends AppCompatActivity {

    String[] items={"Michael gerardi", "Nana Eka Wulandari", "Jonathan Alvin", "Cynthia Kumalasari", "Lionrico Sanjay Exauvida Jeipy",
            "Monica Carista", "Didimus Candra Gased", "Beni Mulia Tabarus", "Grace Hutabarat", "Valeriana Tanesha",
            "Eva kristina", "Ivan Bernov"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahmhs);

        Button updetBtn = (Button)findViewById(R.id.btnUpdate);
        updetBtn.setOnClickListener(btnUpdate);

        Button newBtn = (Button)findViewById(R.id.btnTambah);
        newBtn.setOnClickListener(btnTambah);

        Button delBtn = (Button)findViewById(R.id.btnDelete);
        newBtn.setOnClickListener(btnDelet);


        ListView lv = findViewById(R.id.lvNamaMhs);

        lv.setAdapter(new ArrayAdapter<String>(tambahmhsActivity.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int  position, long id) {
                Toast.makeText(tambahmhsActivity.this,"ANDA MEMILIH" + items[1],Toast.LENGTH_LONG).show();
            }
        });


    }
    private  View.OnClickListener btnUpdate = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(tambahmhsActivity.this,editmhsActivity.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener btnDelet = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(tambahmhsActivity.this,editmhsActivity.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener btnTambah = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(tambahmhsActivity.this,editmhsActivity.class);
            startActivity(intent);
        }
    };

}
