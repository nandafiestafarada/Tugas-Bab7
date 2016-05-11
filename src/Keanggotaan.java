package pllaporan7;

public abstract class Keanggotaan {

    public abstract double diskonlayanan();

    public abstract double diskonproduk();
    public String produk;
    public String jasa;
    public double hargajasa;
    public double hargaProduk;
    public String nama;
    
    public Keanggotaan(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        this.produk = produk;
        this.jasa = jasa;
        this.hargaProduk = hargaProduk;
        this.hargajasa = hargajasa;
        this.nama = nama;
    }

