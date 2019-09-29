package com.example.mhs.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mhs.Model.Mahasiswa;
import com.example.mhs.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {
    ArrayList<Mahasiswa> mahasiswaArrayList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> mahasiswaArrayList) {
        this.mahasiswaArrayList = mahasiswaArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
       View view = layoutInflater.inflate(R.layout.card_view_mahasiswa,parent,false);
       return new ViewHolder(view);
   }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtNpm.setText(mahasiswaArrayList.get(position).getNpm());
        holder.txtNohp.setText(mahasiswaArrayList.get(position).getNohp());
        holder.imgGambar.setImageResource(mahasiswaArrayList.get(position).getGambar());

    }

    @Override
    public int getItemCount() {
        return (mahasiswaArrayList != null)? mahasiswaArrayList.size():0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNama,txtNpm,txtNohp;
        private ImageView imgGambar;

        public ViewHolder(View view){
            super(view);
            imgGambar = view.findViewById(R.id.img_Mahasiswa);
            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = view.findViewById(R.id.txt_npm_mahasiswa);
            txtNohp = view.findViewById(R.id.txt_nohp_mahasiswa);

        }
    }

}
