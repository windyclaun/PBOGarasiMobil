/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asus
 */
public class DataMobil {
    private string nama;
    private string nomor_plat;
    private string merk;
    private int tahun;
    private int harga;

    public DataMobil(string nama, string nomor_plat, string merk, int tahun, int harga) {
        this.nama = nama;
        this.nomor_plat = nomor_plat;
        this.merk = merk;
        this.tahun = tahun;
        this.harga = harga;
    }

    public string getNama() {
        return nama;
    }
    public void setNama(string nama) {
        this.nama = nama;
    }
    public string getNomor_plat() {
        return nomor_plat;
    }
    public void setNomor_plat(string nomor_plat) {
        this.nomor_plat = nomor_plat;
    }
    public string getMerk() {
        return merk;
    }
    public void setMerk(string merk) {
        this.merk = merk;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
