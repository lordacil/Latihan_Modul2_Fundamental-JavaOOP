package com.RizkyNugraha.latihan_modul2.Nomor3;

public class Pacar extends Mahasiswa{
    // Inisiasi Variabel
    String namaPacar, lamaHubungan;

    // Constructor Dengan Parameter
    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    // Mencetak Data dari SubClass dari Parent Class menggunakan Virtual Method Invocation (VMI)
    @Override
    void getStatus() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Status\t\t\t: " + status);
        System.out.println("Semester\t\t: " + semester);
        System.out.println("Nama Pacar\t\t: " + namaPacar);
        System.out.println("Lama Hubungan\t: " + lamaHubungan);
    }
}
