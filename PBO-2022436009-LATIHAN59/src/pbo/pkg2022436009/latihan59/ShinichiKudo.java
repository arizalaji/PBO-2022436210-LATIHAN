/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan59;

public class ShinichiKudo extends TokohUtama {

    public ShinichiKudo() {
        this.nama  = "Shinichi Kudo / Conan Edogawa";
        this.sifat = "Cerdas";
    }

    @Override
    public void siapaKamu() {
        System.out.println("**"+nama+" adalah tokoh protagonis utama dari serial Detektif Conan. " +
                "\nTubuhnya mengecil karena diminumkan racun APTX-4869, kemudian ia menyamar " +
                "\nmenjadi anak kecil dan bernama samaran Conan Edogawa. Ia merahasiakan hal " +
                "\nini kepada orang-orang");
    }

    @Override
    public void kemampuanKamu() {
        System.out.println("Kemampuan : Memecahkan berbagai masalah/kasus ");
    }

    @Override
    public void kelemahanKamu() {
        System.out.println("Kelemahan : -");
    }

    @Override
    public void tampilDataTokoh() {
        super.tampilDataTokoh();
    }
}
