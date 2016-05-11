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
    
    public String getNama() {
        return nama;
    }

    public String getproduk() {
        return produk;
    }

    public String getjasa() {
        return jasa;
    }

    public double getHargaPelayanan() {
        return hargajasa;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }

    public void anggota() {
        System.out.println("");
    }
    
    public void tampilkan() {
        System.out.println("Nama               : " + nama);
        System.out.println("Jenis Produk       : " + produk);
        System.out.println("Harga Produk       : Rp. " + hargaProduk);
        System.out.println("jenis Pelayan      : " + jasa);
        System.out.println("Harga Pelayanan    : Rp. " + hargajasa);
    }

    public double bayar() {
        double total;
        total = getHargaProduk() + getHargaPelayanan();
        return total;
    }
}

