package com.RizkyNugraha.latihan_modul2.Nomor2;

public class Burung extends Binatang{
    String nama; // Inisiasi Variabel

    // Constructor
    public Burung(String nama) {
        this.nama = nama;
    }

    /* Mencetak Nama Burung dari Child Burung
    dan, memanggil method Nama() dan Tidur()
    dari class warisan / Parent Class Binatang */
    public void getNama() {
        System.out.println("Nama Burung\t: " + nama);
        Makan("Daging (Karnivora)");
        Tidur("Seperti kebanyakan burung pada umumnya elang beristirahat pada malam hari");
    }

    // Mencetak Method Terbang dari Child Burung
    public void Terbang() {
        System.out.println("Terbang\t\t: Burung bisa terbang karena memiliki sepasang Sayap");
        System.out.println();
    }
}
