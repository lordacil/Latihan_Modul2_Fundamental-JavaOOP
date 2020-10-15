package com.RizkyNugraha.latihan_modul2.Nomor1;

public class Club {

    // Inisiasi Variabel
    String nama, stadion, deskripsi;
    int tahunBerdiri, juaraUcl;

    /* Overloading
        Menggunakan Constructor
        - Tanpa Parameter -
    */
    public Club() {
    }

    /* Overloading
        Menggunakan Constructor
        - Dengan 1 Paremeter -
    */
    public Club(String nama) {
        this.nama = nama;
    }

    /* Overloading
        Menggunakan Constructor
        - Dengan 2 Paremeter -
    */
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    /* Overloading
        Menggunakan Constructor
        - Dengan 3 Paremeter -
    */
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    /* Overloading
        Menggunakan Constructor
        - Dengan 5 Paremeter -
    */
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    // Method getTeam utk mencetak semua data
    public void getTeam() {
        System.out.println("=====================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Stadion\t\t\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi\t\t: " + deskripsi);
        System.out.println("\n=====================");
    }

}
