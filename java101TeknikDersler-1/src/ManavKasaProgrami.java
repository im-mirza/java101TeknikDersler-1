import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        // Meyve fiyatları
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        // Kullanıcıdan kilo bilgilerini alma
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilosu = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilosu = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilosu = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilosu = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilosu = scanner.nextDouble();

        // Toplam tutarı hesaplama
        double toplamTutar = (armutFiyati * armutKilosu) +
                (elmaFiyati * elmaKilosu) +
                (domatesFiyati * domatesKilosu) +
                (muzFiyati * muzKilosu) +
                (patlicanFiyati * patlicanKilosu);

        // Toplam tutarı ekrana yazdırma
        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");

        // Scanner kapatma
        scanner.close();
    }
}
