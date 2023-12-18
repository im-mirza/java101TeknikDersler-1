import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int yas, yolculukTipi;
        float pKM = 0.10f, biletFiyat, km, toplamFiyat, indirim;

        // Scanner nesnesi oluşturulması
        Scanner sc = new Scanner(System.in);

        // Mesafe girişinin alınması ve hatalı giriş kontrolü
        System.out.println("Mesafeyi km turünden Giriniz :");
        km = sc.nextFloat();
        while (true) {
            if (km < 0) {
                System.out.println("Yanlış Girdiniz: Lütfen Mesafeyi km turünden Giriniz : ");
                km = sc.nextFloat();
            } else break;
        }

        // Yaş girişinin alınması ve hatalı giriş kontrolü
        System.out.println("Yaşınızı Giriniz :");
        yas = sc.nextInt();
        while (true) {
            if (yas < 0) {
                System.out.println("Yanlış Girdiniz: Lütfen Yaşınızı Giriniz: ");
                yas = sc.nextInt();
            } else break;
        }

        // Bilet fiyatının hesaplanması ve ekrana yazdırılması
        biletFiyat = km * pKM;
        System.out.println("İndirimsiz Bilet Fiyati:" + biletFiyat + " TL");

        // Yolculuk tipi girişinin alınması ve hatalı giriş kontrolü
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) :");
        yolculukTipi = sc.nextInt();
        while (true) {
            if (yolculukTipi != 1 && yolculukTipi != 2) {
                System.out.println("Yanlış Girdiniz: Lütfen Yolculuk Tipini Doğru Giriniz : ");
                yolculukTipi = sc.nextInt();
            } else if (yolculukTipi == 2) {
                // Gidiş dönüş seçeneği için indirim uygulanması
                indirim = (biletFiyat * 20) / 100;
                biletFiyat = biletFiyat - indirim;
                System.out.println("Size 20% indirim uygulandi: " + biletFiyat + " TL");
                break;
            } else if (yolculukTipi == 1) {
                // Tek yön seçeneği için yaşa göre indirim uygulanması
                if (yas < 12) {
                    indirim = (biletFiyat * 50) / 100;
                    biletFiyat = biletFiyat - indirim;
                    System.out.println("Size 50% indirim uygulandi: " + biletFiyat + " TL");
                    break;
                } else if (yas >= 12 && yas <= 24) {
                    indirim = (biletFiyat * 10) / 100;
                    biletFiyat = biletFiyat - indirim;
                    System.out.println("Size 10% indirim uygulandi: " + biletFiyat + " TL");
                    break;
                } else if (yas >= 24 && yas <= 65) {
                    // 24-65 yaş aralığı için indirim uygulanmaz
                    System.out.println("Bilet Tutari: " + biletFiyat + " TL");
                    break;
                } else if (yas > 65) {
                    // 65 yaş üstü için indirim uygulanması
                    indirim = (biletFiyat * 30) / 100;
                    biletFiyat = biletFiyat - indirim;
                    System.out.println("Size 30% indirim uygulandi: " + biletFiyat + " TL");
                    break;
                }
            }
        }

        // Scanner'ın kapatılması
        sc.close();
    }
}
