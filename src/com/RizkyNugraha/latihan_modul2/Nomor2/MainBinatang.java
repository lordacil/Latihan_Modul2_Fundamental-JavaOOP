package com.RizkyNugraha.latihan_modul2.Nomor2;

import com.RizkyNugraha.latihan_modul2.Nomor1.Club;

public class MainBinatang {

    public static void main(String[] args) {
        // Deklarasi Object dengan Parameter
        Burung subClass_Burung = new Burung("Elang");
        Ikan subClass_Ikan = new Ikan("Cupang");
        Kucing subClass_Kucing = new Kucing("British Shorthair");

        // Memanggil Method getNama() dan Terbang dari Child Burung
        // yang merupakan Turunan dari Class Parent Binatang
        System.out.println("--=| subClass Burung |=--");
        subClass_Burung.getNama();
        subClass_Burung.Terbang();

        // Memanggil Method getNama() dan Terbang dari Child Ikan
        // yang merupakan Turunan dari Class Parent Binatang
        System.out.println("--=| subClass Ikan |=--");
        subClass_Ikan.getNama();
        subClass_Ikan.Berenang();

        // Memanggil Method getNama() dan Terbang dari Child Kucing
        // yang merupakan Turunan dari Class Parent Binatang
        System.out.println("--=| subClass Kucing |=--");
        subClass_Kucing.getNama();
        subClass_Kucing.Meong();


    }

}
