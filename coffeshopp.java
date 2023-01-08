import java.util.Arrays;
import java.util.Scanner;

public class coffeshopp implements transaksi {
    private String[] nama = new String[20];
    private int[] kode = new int[20];
    private int[] harga_satuan = new int[20];
    private int[] jumlah_beli = new int[20];
    private int jumlah_bayar;
    private int[] totalHarga = new int[20];
    private int[] total_pembelian = new int[20];
    public int jumlah_pesanan;
    private int jum_uang, kembalian;
    private int i;


    @Override
    public void pembelian() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\n------------------------------------");
        System.out.println("|      DAFTAR MENU COFFEE SHOP     |");
        System.out.println("------------------------------------\n");
        System.out.println("(1) MOCHA          (Rp,15.000)");
        System.out.println("(2) ESPRESSO       (Rp,15.000)");
        System.out.println("(3) MACCHIATO      (Rp,20.000)");
        System.out.println("(4) COFFEE LATE    (Rp,25.000)");
        System.out.println("(5) ICE LEMON TEA  (Rp,10.000)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan jumlah pesanan = ");
        jumlah_pesanan = scan1.nextInt();
        for ( i = 1; i <= jumlah_pesanan; i++) {
            System.out.println("\nPesanan ke-"+i);
            System.out.print("MASUKKAN KODE PESANAN  = ");
            kode[i] = scan1.nextInt();
            System.out.print("MASUKKAN NAMA PESANAN  = ");
            nama[i] = scan1.next();
            System.out.print("MASUKKAN JUMLAH BELI   = ");
            jumlah_beli[i] = scan1.nextInt();
            System.out.print("MASUKKAN HARGA PESANAN = Rp.");
            harga_satuan[i] = scan1.nextInt();
            total_pembelian[i] = harga_satuan[i] * jumlah_beli[i];
            System.out.print("HARGA = Rp."+total_pembelian[i]);
            totalHarga[i] = jumlah_beli[i]*harga_satuan[i];
            jumlah_bayar=totalHarga[i]+jumlah_bayar;
            System.out.println("");
        }
    }

    @Override
    public void struk() {
        System.out.println("\n\n                             [STRUK PEMBELIAN]");
        System.out.println(" =========================================================================");
        System.out.println(" || NO || kode ||   Nama Barang    || Jumlah ||   Harga   ||   Total    ||");
        System.out.println(" =========================================================================");
        for ( i = 1; i <= jumlah_pesanan ; i++) {
            System.out.println(String.format(" || %2d || %4d || %-16s ||  %3d   || Rp.%6d || Rp.%6d  ||",i, kode[i], nama[i], jumlah_beli[i], harga_satuan[i], total_pembelian[i]));
        }
        System.out.println(" =========================================================================");
        System.out.println("Total Pembayaran                                             = Rp."+jumlah_bayar);

        Scanner bayar = new Scanner(System.in);
        System.out.print("MASUKKAN JUMLAH UANG ANDA                                    = Rp.");
        jum_uang = bayar.nextInt();
        kembalian = jum_uang - jumlah_bayar;
        System.out.println("                                                             ------------ -");
        System.out.println("KEMBALIAN                                                    = Rp."+kembalian);
        System.out.println("\n                 TERIMA KASIH SUDAH MEMBELI PRODUK KAMI ");
        System.out.println("                     (COFFEESHOP BORIA SUKA-SUKA)");
        System.out.println(" =========================================================================\n");
    }

    @Override
    public void daftar() {
        System.out.println("\n\n                Daftar Barang Pembelian");
        System.out.println(" -----------------------------------------------------");
        System.out.println(" | NO | kode |   Nama Barang    | Jumlah |   Harga   |");
        System.out.println(" -----------------------------------------------------");
        for ( i = 1; i <= jumlah_pesanan ; i++) {
            System.out.println(String.format(" | %2d | %4d | %-16s |  %3d   | Rp.%6d |",i, kode[i], nama[i], jumlah_beli[i], harga_satuan[i]));
        }
        System.out.println(" -----------------------------------------------------");
    }
}
