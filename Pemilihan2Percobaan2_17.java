import java.util.Scanner;

public class Pemilihan2Percobaan2_17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        String member,metodeBayar;
        int menu,harga;
        double diskon,total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("Masukkan angka dari menu yang di pilih = ");
        menu = input17.nextInt();
        input17.nextLine();
        System.out.print("Apakah punya member(y/n) ? = ");
        member = input17.nextLine();
        System.out.println("-------------------------");
        System.out.print("Pembayaran Melalui QRIS (y/n) ? = ");
        metodeBayar = input17.nextLine();
        System.out.println("-------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Rice Bowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else{
                System.out.println("Masukkan Pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total Harga Bayar setelah diskon = " + total_bayar);

            if (metodeBayar.equalsIgnoreCase("y")) {
                total_bayar -= 1000;
                System.out.println("Potongan pembayaran via QRIS = Rp 1000");
                System.out.println("Total Harga Bayar Setelah diskon Menggunakan Member dan QRIS : " + total_bayar);
            }
        }

        else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Rice Bowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else{
                System.out.println("Masukkan Pilihan menu dengan benar");
                return;
            }
            System.out.println("Total Bayar = " + harga);

            if (metodeBayar.equalsIgnoreCase("y")) {
                harga -= 1000;
                System.out.println("Potongan pembayaran via QRIS = Rp 1000");
                System.out.println("Total Harga Bayar Setelah diskon Menggunakan QRIS : " + harga);
            }
        } else { 
            System.out.println("Member Tidak Valid");
        }
        System.out.println("-------------------------");
    }
}
