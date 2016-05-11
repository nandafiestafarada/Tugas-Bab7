
package pllaporan7;

public class Member extends Keanggotaan {  
    public Member ( String produk, String jasa, double hargaProduk, double hargajasa, String nama){
        super( produk, jasa, hargaProduk, hargajasa, nama);
    } 
    
    public double diskonproduk(){
        return 0.1;
    }
    public void anggota (){
        System.out.println("Anda masuk dalam anggota member ");
    }
      @Override
    public double diskonlayanan() {
        return 0;
    }
       public double bayar(){
      double total;
      total = super.bayar()- super.getHargaProduk()*diskonproduk();
      return total;
    }
}
