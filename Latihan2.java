import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        int diskon = 0;

        System.out.print("Masukkan Jenis Buku : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = sc.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if(jenisBuku.equalsIgnoreCase("novel")){
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        }else{
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }

        System.out.println("Total Diskon anda : " + diskon + "%");
    }
}
