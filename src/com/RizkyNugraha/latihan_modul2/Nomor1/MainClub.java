package com.RizkyNugraha.latihan_modul2.Nomor1;

public class MainClub {

    public static void main(String[] args) {
        // Deklarasi Object
        Club clubParameter_0 = new Club();
        Club clubParameter_1 = new Club("Uzumaki Saburo");
        Club clubParameter_2 = new Club("Anos Voldigoad", "Club ini merupakan club yang paling muda ");
        Club clubParameter_3 = new Club("Veldora Tempest", 1999, "Tokyo NCT");
        Club clubParameter_5 = new Club("Izuku Midoriya", clubParameter_3.tahunBerdiri, clubParameter_3.stadion,
                4, "Club yang banyak Pendukungnya dibanding dengan yang lain");

        // Kondisi Jika clubParameter(0-5) == Null maka akan di inisiasi yang kosongnya
        if (clubParameter_0.nama == null || clubParameter_0.tahunBerdiri == 0 || clubParameter_0.stadion == null ||
                clubParameter_0.juaraUcl == 0 || clubParameter_0.deskripsi == null && clubParameter_1.tahunBerdiri == 0 || clubParameter_1.stadion == null ||
                clubParameter_1.juaraUcl == 0 || clubParameter_1.deskripsi == null && clubParameter_2.tahunBerdiri == 0 || clubParameter_2.stadion == null ||
                clubParameter_2.juaraUcl == 0 && clubParameter_3.juaraUcl == 0 || clubParameter_3.deskripsi == null) {

            // Inisiasi club tanpa Parameter
            clubParameter_0.nama = "Rizky Nugraha Herliyanto";
            clubParameter_0.tahunBerdiri = 2001;
            clubParameter_0.stadion = "Bikini Bottom";
            clubParameter_0.juaraUcl = 10;
            clubParameter_0.deskripsi = "Club " + clubParameter_0.stadion + " merupakan club internasional yang sudah " +
                    "pernah mendapatkan " + clubParameter_0.juaraUcl + "x Kejuaraan";

            // Inisiasi 1 Parameter
            clubParameter_1.tahunBerdiri = 1945;
            clubParameter_1.stadion = "Konohagakure";
            clubParameter_1.juaraUcl = 3;
            clubParameter_1.deskripsi = clubParameter_1.stadion + " merupakan club tertua di dalam dunia PerNinjaan";

            // Inisiasi 2 Parameter
            clubParameter_2.tahunBerdiri = 2004;
            clubParameter_2.stadion = "Busan KR";
            clubParameter_2.juaraUcl = 1;

            // Inisiasi 3 Parameter
            clubParameter_3.juaraUcl = clubParameter_5.juaraUcl;
            clubParameter_3.deskripsi = clubParameter_5.deskripsi;

        } else {
            System.out.println("Tidak ada yang NULL");
        }

        // Mengambil Data Dari class CLUB
        System.out.println("=====================");
        System.out.println("Club Tanpa Parameter");
        clubParameter_0.getTeam();
        System.out.println("Club 1 Parameter");
        clubParameter_1.getTeam();
        System.out.println("Club 2 Parameter");
        clubParameter_2.getTeam();
        System.out.println("Club 3 Parameter");
        clubParameter_3.getTeam();
        System.out.println("Club 5 Parameter");
        clubParameter_5.getTeam();

    }

}
