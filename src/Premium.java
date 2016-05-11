package pllaporan7;

public class Premium extends Member {

    double diskon;

    public Premium(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }
    
    public double diskonlayanan() {
        return 0.2;
    }

    public double diskonproduk() {
        return super.diskonproduk();
    }

    public void anggota() {
        super.anggota();
        System.out.println("Member anda adalah PREMIUM");
        System.out.println("Diskon Pelayanan sebesar 20 % jika melakukan perawatan");
        System.out.println("Diskon Produk sebesar 10 % jika membeli produk");
    }

    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaPelayanan() * diskonlayanan();
        return total;
    }
}

