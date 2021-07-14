/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angga
 */
public class Gaji {
    
    String golongan;
    int gajiPokok;
    int masaKerja;

    public Gaji() {
    }

    public Gaji(String golongan, int gajiPokok, int masaKerja) {
        this.golongan = golongan;
        this.gajiPokok = gajiPokok;
        this.masaKerja = masaKerja;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
    
    
    
}
