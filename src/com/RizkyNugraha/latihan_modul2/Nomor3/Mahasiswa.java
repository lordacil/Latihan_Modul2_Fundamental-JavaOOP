package com.RizkyNugraha.latihan_modul2.Nomor3;

public class Mahasiswa {
    // Inisiasi Variabel
    String nama, status;
    int semester;

    // Constructor Tanpa Parameter
    public Mahasiswa() {
    }

    // Constructor Dengan Parameter
    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    // Mencetak Data dari Parent Class
    void getStatus() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Status\t\t: " + status);
        System.out.println("Semester\t: " + semester);
    }
}
