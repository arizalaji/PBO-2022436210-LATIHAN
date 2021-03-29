/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan60;

import java.util.Scanner;

/**
 *
 * @author kazui
 */
public class Main {
    public static void main(String[] args) {
//        Deklarasi & Instasiasi
        int i,pilihan;
        char lagi;
        String[] listNama = {"Itachi Uchiha","Kisame Hoshigaki","Sasori","Deidara","Orochimaru","Hidan","Kakuzu","Zetsu"
            ,"Obito Uchiha","Pain","Konan"};
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

    do {
//        List Perulangan -> Daftar Anggota
        System.out.println("===Daftar Anggota Akatsuki===");
        for (i=0; i<listNama.length; i++){
            System.out.println(i+1+". "+listNama[i]);
        }

//        Pilih Nomor pilihan Anda
        System.out.print("\nMasukkan Pilihan Anda (1~"+i+"): ");
        pilihan = scn1.nextInt();

//        Proses pilihan Anda
        switch (pilihan){
            case 1 -> {
                Itachi itachi = new Itachi();
                itachi.tampilData();
                System.out.println("Partner : "+itachi.getPartnerKerja());
                itachi.jabatan();
                }
            case 2 -> {
                Kisame kisame = new Kisame();
                kisame.tampilData();
                System.out.println("Partner : "+kisame.getPartnerKerja());
                kisame.jabatan();
                }
            case 3 -> {
                Sasori sasori = new Sasori();
                sasori.tampilData();
                System.out.println("Partner : "+sasori.getPartnerKerja());
                sasori.jabatan();
                }
            case 4 -> {
                Deidara deidara = new Deidara();
                deidara.tampilData();
                System.out.println("Partner : "+deidara.getPartnerKerja());
                deidara.jabatan();
                }
            case 5 -> {
                Orochimaru orochimaru = new Orochimaru();
                orochimaru.tampilData();
                System.out.println("Partner : "+orochimaru.getPartnerKerja());
                orochimaru.jabatan();
                }
            case 6 -> {
                Hidan hidan = new Hidan();
                hidan.tampilData();
                System.out.println("Partner : "+hidan.getPartnerKerja());
                hidan.jabatan();
                }
            case 7 -> {
                Kakuzu kakuzu = new Kakuzu();
                kakuzu.tampilData();
                System.out.println("Partner : "+kakuzu.getPartnerKerja());
                kakuzu.jabatan();
                }
            case 8 -> {
                Zetsu zetsu = new Zetsu();
                zetsu.tampilData();
                System.out.println("Partner : "+zetsu.getPartnerKerja());
                zetsu.jabatan();
                }
            case 9 -> {
                Obito obito = new Obito();
                obito.tampilData();
                System.out.println("Partner : "+obito.getPartnerKerja());
                obito.jabatan();
                }
            case 10 -> {
                Pain pain = new Pain();
                pain.tampilData();
                System.out.println("Partner : "+pain.getPartnerKerja());
                pain.jabatan();
                }
            case 11 -> {
                Konan konan = new Konan();
                konan.tampilData();
                System.out.println("Partner : "+konan.getPartnerKerja());
                konan.jabatan();
                }
            default -> System.out.println("Nomor yang Anda pilih belum tersedia");
        }

//      Apakah mengulang lagi atau selesai
    System.out.print("\nLagi (y/n)? : ");
    lagi = scn2.next().charAt(0);
    }while(lagi != 'n');

    }
}
