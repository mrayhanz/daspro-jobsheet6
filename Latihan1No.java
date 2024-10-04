import java.util.Scanner;

public class Latihan1No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1,bil2,bil3;
        int bilTerbesar;

        System.out.print("Masukkan Bilangan pertama : ");
        bil1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Bilangan Kedua : ");
        bil2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Bilangan Ketiga : ");
        bil3 = sc.nextInt();
        sc.nextLine();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilTerbesar = bil1;
            }else{
                bilTerbesar = bil3;
            }
        } else{
            if (bil2 > bil3) {
                bilTerbesar = bil2;
            }else {
                bilTerbesar = bil3;
            }
        }

        System.out.println("Bilangan Terbesar adalah : " + bilTerbesar);
    }
}