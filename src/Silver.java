package pllaporan7;

public class Silver extends Member {

    double diskon;

    public Silver(String produk, String jasa, double hargaProduk, double hargajasa, String nama) {
        super(produk, jasa, hargaProduk, hargajasa, nama);
    }

    public double diskonlayanan() {
        return 0.1;
    }

    public double diskonproduk() {
        return super.diskonproduk();
    }

    public void anggota() {
        super.anggota();
        System.out.println("Member anda adalah SILVER");
        System.out.println("Diskon Pelayanan sebesar 10 % jika melakukan perawatn");
        System.out.println("Diskon Produk sebesar 10 % jika membeli produk");
    }

    public double bayar() {
        double total;
        total = super.bayar() - super.getHargaPelayanan() * diskonlayanan();
        return total;
    }
}

