package com.example.mhs.Model;

public class Mahasiswa {
        private String nama;
        private String npm;
        private String nohp;
        private int gambar;

        public Mahasiswa(String nama, String npm, String nohp, int gambar) {
            this.nama = nama;
            this.npm = npm;
            this.nohp = nohp;
            this.gambar = gambar;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNpm() {
            return npm;
        }

        public void setNpm(String npm) {
            this.npm = npm;
        }

        public String getNohp() {
            return nohp;
        }

        public void setNohp(String nohp) {
            this.nohp = nohp;
        }

        public void setGambar(int gambar) {
            this.gambar = gambar;
        }

        public  int getGambar()  {
            return gambar;
        }

    }



