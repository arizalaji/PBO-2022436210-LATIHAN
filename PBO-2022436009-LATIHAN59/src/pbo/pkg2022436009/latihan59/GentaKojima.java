/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan59;

public class GentaKojima extends TokohUtama {

    public GentaKojima() {
        this.nama  = "Genta Kojima";
        this.sifat = "Baik dan bisa diandalkan";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah Tokoh dalam grup detektif cilik. Ia berbadan besar. " +
                "\n ia adalah anak nakal yang ditakuti oleh anak-anak. Namun, kini ia " +
                "\nmenjadi anak baik dan menyatakan diri sebagai ketua grup detektif cilik. " +
                "\nIa juga menaruh hati pada Ayumi Yoshida. ");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : - ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : - ");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
