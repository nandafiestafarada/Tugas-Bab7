package pllaporan7;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String produk, jasa, nama;
        double hproduk, hjasa;
        int pilihan;
        String line = "*********************************************************";
        String line1 = "*******************************";
        do {
            System.out.println("MENU MEMBER");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Bukan Member");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan anda :  ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\n     MENU SALON KECANTIKAN     ");
                    System.out.println(line1);
                    System.out.println("           PELAYANAN           ");
                    System.out.println(line1);
                    System.out.println("KRIMBAT        =   Rp. 30000");
                    System.out.println("FACIAL         =   RP. 60000");
                    System.out.println("RIBONDING      =   Rp. 100000");
                    System.out.println(line1);
                    System.out.println("            PRODUK             ");
                    System.out.println(line1);
                    System.out.println("SHAMPO         =   Rp. 20000");
                    System.out.println("MASKARA        =   Rp. 25000");
                    System.out.println("AIRLINER       =   RP. 30000");
                    System.out.println(line1 + "\n");
                    System.out.print("Masukkan nama anda                : ");
                    nama = in.next();
                    System.out.print("Masukkan jenis produk yang dibeli : ");
                    produk = in.next();
                    System.out.print("Masukkan harga produk yang dibeli : Rp. ");
                    hproduk = in.nextDouble();
                    System.out.print("Masukkan jenis pelayanan          : ");
                    jasa = in.next();
                    System.out.print("Masukkan harga pelayanan          : Rp. ");
                    hjasa = in.nextDouble();
                    Keanggotaan p = new Premium(produk, jasa, hproduk, hjasa, nama);
                    System.out.println(line);
                    p.anggota();
                    System.out.println(line);
                    p.tampilkan();
                    System.out.println("Total Pembayaran   : Rp. " + p.bayar());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\n     MENU SALON KECANTIKAN     ");
                    System.out.println(line1);
                    System.out.println("           PELAYANAN           ");
                    System.out.println(line1);
                    System.out.println("KRIMBAT        =   Rp. 30000");
                    System.out.println("FACIAL         =   RP. 60000");
                    System.out.println("RIBONDING      =   Rp. 100000");
                    System.out.println(line1);
                    System.out.println("            PRODUK             ");
                    System.out.println(line1);
                    System.out.println("SHAMPO         =   Rp. 20000");
                    System.out.println("MASKARA        =   Rp. 25000");
                    System.out.println("AIRLINER       =   RP. 30000");
                    System.out.println(line1 + "\n");
                    System.out.print("Masukkan nama anda                : ");
                    nama = in.next();
                    System.out.print("Masukkan jenis produk yang dibeli : ");
                    produk = in.next();
                    System.out.print("Masukkan harga produk yang dibeli : Rp. ");
                    hproduk = in.nextDouble();
                    System.out.print("Masukkan jenis pelayanan          : ");
                    jasa = in.next();
                    System.out.print("Masukkan harga pelayanan          : Rp. ");
                    hjasa = in.nextDouble();
                    Keanggotaan g = new Gold(produk, jasa, hproduk, hjasa, nama);
                    System.out.println(line);
                    g.anggota();
                    System.out.println(line);
                    g.tampilkan();
                    System.out.println("Total Pembayaran   : Rp. " + g.bayar());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n     MENU SALON KECANTIKAN     ");
                    System.out.println(line1);
                    System.out.println("           PELAYANAN           ");
                    System.out.println(line1);
                    System.out.println("KRIMBAT        =   Rp. 30000");
                    System.out.println("FACIAL         =   RP. 60000");
                    System.out.println("RIBONDING      =   Rp. 100000");
                    System.out.println(line1);
                    System.out.println("            PRODUK             ");
                    System.out.println(line1);
                    System.out.println("SHAMPO         =   Rp. 20000");
                    System.out.println("MASKARA        =   Rp. 25000");
                    System.out.println("AIRLINER       =   RP. 30000");
                    System.out.println(line1 + "\n");
                    System.out.print("Masukkan nama anda                : ");
                    nama = in.next();
                    System.out.print("Masukkan jenis produk yang dibeli : ");
                    produk = in.next();
                    System.out.print("Masukkan harga produk yang dibeli : Rp. ");
                    hproduk = in.nextDouble();
                    System.out.print("Masukkan jenis pelayanan          : ");
                    jasa = in.next();
                    System.out.print("Masukkan harga pelayanan          : Rp. ");
                    hjasa = in.nextDouble();
                    Keanggotaan s = new Silver(produk, jasa, hproduk, hjasa, nama);
                    System.out.println(line);
                    s.anggota();
                    System.out.println(line);
                    s.tampilkan();
                    System.out.println("Total Pembayaran   : Rp. " + s.bayar());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n     MENU SALON KECANTIKAN     ");
                    System.out.println(line1);
                    System.out.println("           PELAYANAN           ");
                    System.out.println(line1);
                    System.out.println("KRIMBAT        =   Rp. 30000");
                    System.out.println("FACIAL         =   RP. 60000");
                    System.out.println("RIBONDING      =   Rp. 100000");
                    System.out.println(line1);
                    System.out.println("            PRODUK             ");
                    System.out.println(line1);
                    System.out.println("SHAMPO         =   Rp. 20000");
                    System.out.println("MASKARA        =   Rp. 25000");
                    System.out.println("AIRLINER       =   RP. 30000");
                    System.out.println(line1 + "\n");
                    System.out.print("Masukkan nama anda                : ");
                    nama = in.next();
                    System.out.print("Masukkan jenis produk yang dibeli : ");
                    produk = in.next();
                    System.out.print("Masukkan harga produk yang dibeli : Rp. ");
                    hproduk = in.nextDouble();
                    System.out.print("Masukkan jenis pelayanan          : ");
                    jasa = in.next();
                    System.out.print("Masukkan harga pelayanan          : Rp. ");
                    hjasa = in.nextDouble();
                    Keanggotaan no = new BukanMember(produk, jasa, hproduk, hjasa, nama);
                    System.out.println(line);
                    no.anggota();
                    System.out.println(line);
                    no.tampilkan();
                    System.out.println("Total Pembayaran   : Rp. " + no.bayar());
                    System.out.println();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Masukan anda tidak ada");
            }
        } while (pilihan >= 1 && pilihan < 5);
    }
}
