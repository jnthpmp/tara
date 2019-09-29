package com.example.mhs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mhs.Adapter.MahasiswaAdapter;
import com.example.mhs.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();
        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new
        LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);


    }

    private void addData() {


        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));
        mahasiswaArrayList.add(new Mahasiswa("Jona", "72170094","081328308",R.drawable.merci));

    }
}

