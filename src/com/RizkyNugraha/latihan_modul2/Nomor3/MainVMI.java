package com.RizkyNugraha.latihan_modul2.Nomor3;

public class MainVMI {
    public static void main(String[] args) {

    /*  Jika SuperClass / Parent
        Merujuk ke SuperClass / Parent itu sendiri
        maka otomatis getStatus() di SuperClass / Parent dipanggil */
        Mahasiswa Parent = new Mahasiswa("Jung Eunbi", "Menikah", 5);

        // Memanggil method getStatus() dari class Parent / SuperClass
        System.out.println("=======| Parent |=======");
        Parent.getStatus();
        System.out.println("========================\n");

    /*  Jika SuperClass / Parent
        Merujuk ke Object SubClass / Child getStatus()
        Maka ini disebut Virtual Method Invocation (Overriding/Override) */
        Mahasiswa parentChild = new Pacar("Rizky Nugraha", Parent.status,
                3, Parent.nama, "20 Tahun");

        // Memanggil method getStatus() dari class child / SubClass
        System.out.println("===| ParentChild dengan VMI |===");
        parentChild.getStatus();
        System.out.println("================================");

    }
}
