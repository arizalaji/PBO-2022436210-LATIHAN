/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022436009.latihan54;

/**
 *
 * @author kazui
 */
    public class WarnaKoordinat extends Koordinat {
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x,y);
        setNamaWarna(namaWarna);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public final void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }

}
