/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan60;

public class Sasori extends Akatsuki {
    private final String partnerKerja;

    public Sasori() {
        this.nama = "Sasori";
        this.asalNegara = "Sunagakure";
        this.elemen = "-";
        this.jutsu = "Kugutsu";
        this.partnerKerja = "Orochimaru setelah itu Deidara";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " dikenal sebagai \"Sasori si Pasir merah\"");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
