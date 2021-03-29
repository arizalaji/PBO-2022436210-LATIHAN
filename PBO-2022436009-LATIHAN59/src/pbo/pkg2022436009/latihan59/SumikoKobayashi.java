/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan59;

public class SumikoKobayashi extends TokohUtama {

    public SumikoKobayashi() {
        this.nama  = "Sumiko Kobayashi";
        this.sifat = "Pemalu dan Sensitif";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah wali kelasConan. ia sangat sayang pada " +
                "\n anak-anak. Ia juga suka novel misteri, terutama karya Edogawa Rampo.");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Mengajar ");
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
