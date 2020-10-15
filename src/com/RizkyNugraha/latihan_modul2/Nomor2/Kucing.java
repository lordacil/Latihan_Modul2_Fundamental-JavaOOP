package com.RizkyNugraha.latihan_modul2.Nomor2;

public class Kucing extends Binatang{
    String nama; // Inisasi Variabel

    // Constructor
    public Kucing(String nama) {
        this.nama = nama;
    }

    /* Mencetak Nama Kucing dari Child Kucing
    dan, memanggil method Nama() dan Tidur()
    dari class warisan / Parent Class Binatang */
    public void getNama() {
        System.out.println("Nama Kucing : " + nama);
        Makan("Whiskas, ikan(asin,bandeng.dll)");
        Tidur("Kucing Tidur rata-rata 15 jam sehari dan-\n\t\t\t  beberapa bisa tidur hingga 20 jam dalam jangka waktu 24 jam");
    }

    // Mencetak Method Meong dari Child Kucing
    public void Meong() {
        System.out.println("Meong\t\t: Kucing berbicara dengan bahasa Meong");
        System.out.println();
    }
}
