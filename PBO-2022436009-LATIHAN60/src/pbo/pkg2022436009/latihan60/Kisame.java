/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan60;

public class Kisame extends Akatsuki {
    private String partnerKerja;

    public Kisame() {
        this.nama = "Kisame Hoshigaki";
        this.asalNegara = "Kirigakure";
        this.elemen = "Air";
        this.jutsu = "Jurus Elemen Air";
        this.partnerKerja = "Itachi Uchiha";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " dijuluki sebagai bijuu tanpa ekor karna dia memiliki cakra yang sangat banyak " +
                "\n**seperti para bijuu, dia pengguna pedang Samehadaku yang dapat menyerap cakra lawan.\n");
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
