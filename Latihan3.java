import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String merk,kategori;
        int ukuran;

        System.out.print("Masukkan Merk Sepatu : ");
        merk =  sc.nextLine();
        System.out.print("Masukkan Kategori Sepatu : ");
        kategori =  sc.nextLine();
        System.out.print("Masukkan ukuran Sepatu : ");
        ukuran =  sc.nextInt();
        sc.nextLine();

        if (merk.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36) {
                    System.out.print("Harga Rp 800.000");
                }else if (ukuran <= 40) {
                    System.out.print("harga Rp 800.000");
                }else{
                    System.out.println("Ukuran Invalid");
                }
            }else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40) {
                    System.out.print("Harga Rp 1.200.000");
                }else if (ukuran <= 44) {
                    System.out.print("harga Rp 1.200.000");
                }else{
                    System.out.println("Ukuran Invalid");
                }
            }else{
                System.out.println("Kategori invalid");
            }
        }else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36) {
                    System.out.print("Harga Rp 1.000.000");
                }else if (ukuran <= 41) {
                    System.out.print("harga Rp 1.000.000");
                }else{
                    System.out.println("Ukuran Invalid");
                }
            }else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41) {
                    System.out.print("Harga Rp 1.800.000");
                }else if (ukuran <= 44) {
                    System.out.print("harga Rp 1.800.000");
                }else{
                    System.out.println("Ukuran Invalid");
                }
            }else{
                System.out.println("Kategori invalid");
            }
        }else if (merk.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36) {
                    System.out.print("Harga Rp 750.000");
                }else if (ukuran <= 40) {
                    System.out.print("harga Rp 750.000");
                }else{
                    System.out.println("Ukuran Invalid");
                }
            }else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40) {
                    System.out.print("Harga Rp 1.500.000");
                }else if (ukuran <= 44) {
                    System.out.print("harga Rp 1.500.000");
                }else{
                    System.out.println("Ukuran Invalid");
                }
            }else{
                System.out.println("Kategori invalid");
            }
        }else{
            System.out.println("Merk invalid");
        }
    }
}
