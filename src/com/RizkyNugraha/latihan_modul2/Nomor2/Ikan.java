package com.RizkyNugraha.latihan_modul2.Nomor2;

public class Ikan extends Binatang{
    String nama; // Inisiasi variabel

    // Constructor
    public Ikan(String nama) {
        this.nama = nama;
    }

    /* Mencetak Nama Ikan dari Child Ikan
    dan, memanggil method Nama() dan Tidur()
    dari class warisan / Parent Class Binatang */
    public void getNama() {
        System.out.println("Nama Ikan\t: " + nama);
        Makan("Pelet, Cacing, dll.");
        Tidur("Ikan juga bisa tidur layaknya makhluk hidup lainnya, walaupun-\n" +
                "\t\t\t  tidak memiliki kelopak mata. Ikan tidur dengan mata terbuka");
    }

    // Mencetak Method Berenang dari Child Ikan
    public void Berenang() {
        System.out.println("Berenang\t: Ikan Berenang karena habitatnya di dalam Air, dan Bernafasnya menggunakan Insang");
        System.out.println();
    }
}
