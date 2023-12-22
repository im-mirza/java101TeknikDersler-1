import java.util.Scanner;

public class AsalSayiKontrol {

    // Recursive metot: Bir sayının asal olup olmadığını kontrol etme
    static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 1) {
            return false; // 1 ve negatif sayılar asal değildir
        } else if (bolen == 1) {
            return true; // 2'den büyük her sayı, 1 ve kendisi dışında bir bölen içerir
        } else if (sayi % bolen == 0) {
            return false; // Sayı, bölendiği bir böleni içeriyorsa asal değildir
        } else {
            return isAsal(sayi, bolen - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, sayi - 1)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

        scanner.close();
    }
}
