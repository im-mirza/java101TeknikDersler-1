import java.util.Scanner;

public class TipDonusumProgrami {

    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan giriş alınır.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayı girişi istenir.
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı girişi istenir.
        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme
        double tamSayiOndalikli = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int ondalikliSayiTam = (int) ondalikliSayi;

        // Sonuçları ekrana yazdırma
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürme: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme: " + ondalikliSayiTam);

        // Scanner kapatılır.
        scanner.close();
    }
}
