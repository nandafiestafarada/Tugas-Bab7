package pllaporan7;

public class BukanMember extends Keanggotaan {

    double diskon;

    public BukanMember(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }
    
    public double diskonlayanan() {
        return 0;
    }

    public double diskonproduk() {
        diskon = 0;
        return diskon;
    }

    public void anggota() {
        System.out.println("Anda bukan termasuk Member, tidak ada diskon untuk Anda");
    }

    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaProduk() * diskonproduk();
        return total;
    }
}
