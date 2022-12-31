import java.util.Scanner;

public class coffeshopp implements transaksi {
    private String nama;
    private int kode;
    private double total;
    private int harga_satuan;
    private int jumlah_beli;
    private int jumlah_bayar;
    private double totalHarga;


    @Override
    public void proses() {
        Scanner scan1 = new Scanner(System.in);
        int jumlah_pesanan;
        System.out.println("\n------------------------------------");
        System.out.println("|      DAFTAR MENU COFFEE SHOP     |");
        System.out.println("------------------------------------\n");
        System.out.println("(1) MOCHA          (Rp,15.000)");
        System.out.println("(2) ESPRESSO       (Rp,15.000)");
        System.out.println("(3) MACCHIATO      (Rp,20.000)");
        System.out.println("(4) COFFEE LATE    (Rp,25.000)");
        System.out.println("(5) ICE LEMON TEA  (Rp,10.000)");
        System.out.println("-----------------------------\n");
        System.out.print("Masukkan jumlah pesanan = ");
        jumlah_pesanan = scan1.nextInt();
        for (int i = 1; i <= jumlah_pesanan; i++) {
            System.out.printf("MASUKKAN KODE PESANAN  = ");
            kode = scan1.nextInt();
            System.out.print("MASUKKAN NAMA PESANAN  = ");
            nama = scan1.next();
            System.out.printf("MASUKKAN JUMLAH BELI   = ");
            jumlah_beli = scan1.nextInt();
            System.out.printf("MASUKKAN HARGA PESANAN = Rp.");
            harga_satuan = scan1.nextInt();
            total = jumlah_pesanan * harga_satuan;
            totalHarga = total + totalHarga;
            System.out.println("");
        }
        System.out.println("\n\n                Daftar Barang Pembelian");
        System.out.println(" ===================================================================");
        System.out.println(" || kode ||   Nama Barang    || Jumlah ||   Harga   ||   Total    ||");
        System.out.println(" ===================================================================");
        System.out.println(String.format(" || %4d || %-16s ||  %3d   || Rp.%6d || Rp %7.0f ||", kode, nama, jumlah_beli, harga_satuan, total));
        System.out.println(" ===================================================================");
        System.out.println(String.format("\n Total                                      = Rp %10.0f", totalHarga));
    }
}
//    @Override
//    public void struk() {
//        System.out.println("\n\n                Daftar Barang Pembelian");
//        System.out.println(" ===================================================================");
//        System.out.println(" || kode ||   Nama Barang    || Jumlah ||   Harga   ||   Total    ||");
//        System.out.println(" ===================================================================");
//        System.out.println(String.format(" || %4d || %-16s ||  %3d   || Rp.%6d || Rp %7.0f ||",kode,nama,jumlah_beli,harga_satuan,total));
//        System.out.println(" ===================================================================");
//        System.out.println(String.format("\n Total                                      = Rp %10.0f",totalHarga));
 //       System.out.println(String.format(" Total Pembayaran                           =Rp %10.0f",jumlah_bayar));
    //}