import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        coffeshopp cs;
        cs = new coffeshopp();
        Scanner input = new Scanner(System.in);
        int pilih_menu;
        do {
            System.out.println("\n\n-----------------------------------------------------");
            System.out.println("|    PROGRAM KASIR PEMESANAN PADA COFFE SHOP        |");
            System.out.println("|                 BORIA SUKA-3SUKA                   |");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. PEMBELIAN ");
            System.out.println("2. DAFTAR PEMBELIAN");
            System.out.println("3. STRUK PEMBELIAN");
            System.out.println("4. KELUAR ");
            System.out.printf("   MASUKAN PILIHAN ANDA   = ");
            pilih_menu = input.nextInt();
            if (pilih_menu==1){
                cs.pembelian();
            }
            else if (pilih_menu==2) {
                cs.daftar();
            }
            else if (pilih_menu==3){
                cs.struk();
            }
            else if (pilih_menu==4){
                System.out.println("TERIMAKASIH !!!!");
            }else {
                System.out.println("DATA YANG ANDA MASUKAN TIDAK VALID !!!");
            }
        }while (pilih_menu!=4);
    }
}
