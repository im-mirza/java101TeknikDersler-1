import java.util.Scanner;

public class EnbuyukVeEnKucukSayilariBulanProgram {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int girilenSayi, enBuyuksayi = 0, enKucukSayi = 0, min, sayi;
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini iste
        System.out.println("Kaç adet sayı gireceksiniz?");
        girilenSayi = sc.nextInt();

        // İlk sayıyı en küçük ve en büyük sayı olarak ata
        System.out.println("1. sayıyı giriniz:");
        min = sc.nextInt();
        enBuyuksayi = min;

        // Diğer sayıları kontrol et ve en küçük ve en büyük sayıları güncelle
        for (int i = 2; i <= girilenSayi; i++) {
            System.out.println(i + ". sayıyı giriniz:");
            sayi = sc.nextInt();

            // En küçük sayıyı kontrol et ve güncelle
            if (min > sayi) {
                min = sayi;
            }

            // En büyük sayıyı kontrol et ve güncelle
            if (enBuyuksayi < sayi) {
                enBuyuksayi = sayi;
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("En büyük sayı: " + enBuyuksayi);
        System.out.println("En küçük sayı: " + min);

        // Scanner'ı kapat
        sc.close();
    }
}
