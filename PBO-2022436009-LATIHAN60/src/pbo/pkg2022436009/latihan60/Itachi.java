/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan60;

/**
 *
 * @author kazui
 */
public class Itachi extends Akatsuki {
    private final String partnerKerja;

    public Itachi() {
        this.nama = "Itachi Uchiha";
        this.asalNegara = "Konohagakure";
        this.elemen = "Api, Angin, Air, Yin, Yang";
        this.jutsu = "Amaterasu, Genjutsu Sharingan, Izanami, Susanoo, Teknik Klok Bayangan, Tsukoyomi";
        this.partnerKerja = "Kisame Hoshigaki";
    }

    @Override
    public void jabatan() {
        System.out.println("**" + nama + " adalah anggota Akatsuki yang sebenarnya adalah mata-mata yang bekerja untuk " + asalNegara);
    }

    public String getPartnerKerja() {
        return partnerKerja;
    }


}
