import java.util.Scanner;

public class TekVeCiftSayilarinToplami {
    public static void main(String[] args) {
        // Toplam değişkeni, çift ve 4'ün katı olan sayıların toplamını tutar
        int toplam = 0;

        // Kullanıcıdan alınacak sayıyı tutan değişken
        int girilenSayi;

        // Scanner nesnesi oluşturulur
        Scanner sc = new Scanner(System.in);

        // Sonsuz bir döngü başlatılır
        while (true) {
            // Kullanıcıdan sayı alınır
            System.out.println("Bir sayı giriniz:");
            girilenSayi = sc.nextInt();

            // Girilen sayı çift ve 4'ün katı ise toplama eklenir
            if (girilenSayi % 2 == 0 && girilenSayi % 4 == 0) {
                toplam += girilenSayi;
            }
            // Girilen sayı tek ve 4'ün katı değilse döngüden çıkılır
            else if (girilenSayi % 2 != 0 && girilenSayi % 4 != 0) {
                break;
            }
        }

        // Toplam sonucu ekrana yazdırılır
        System.out.println("Girilen sayıların 2'ye ve 4'e bölünenlerinin toplamı: " + toplam);

        // Scanner kapatılır
        sc.close();
    }
}
