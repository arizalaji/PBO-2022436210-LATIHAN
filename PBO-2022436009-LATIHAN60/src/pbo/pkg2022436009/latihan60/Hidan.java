/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan60;

public class Hidan extends Akatsuki {
    private final String partnerKerja;

    public Hidan() {
        this.nama = "Hidan";
        this.asalNegara = "Yugakure";
        this.elemen = "-";
        this.jutsu = "Ritual Jashin";
        this.partnerKerja = "Kakuzu";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah seorang penganut agama bernama 'Jashin', sebuah kepercayaan yang menyembah " +
                "\nDewa Jashin. Dia Tidak bisa dibunuh, dan bisa melukai lawannya dengan cara melukai dirinya " +
                "\nsendiri setelah meminum darah lawannya.");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
