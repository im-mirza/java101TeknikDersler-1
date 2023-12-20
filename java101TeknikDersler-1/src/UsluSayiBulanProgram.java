import java.util.Scanner;

public class UsluSayiBulanProgram {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak sayı adedini ve her bir sayıyı kullanıcıdan almak için Scanner kullanılır.
        int saygac;
        int ussuAlinanSayi;
        Scanner sc = new Scanner(System.in);

        // Kaç adet sayı gireceği kullanıcıya sorulur.
        System.out.println("Kac sayi gireceksinz ? ");
        saygac = sc.nextInt();

        // Belirtilen sayı adedi kadar döngü çalıştırılır.
        for (int i = 0; i < saygac; i++) {
            // Her bir sayı kullanıcıdan alınır.
            System.out.println(i + 1 + ".ci sayi girin: ");
            ussuAlinanSayi = sc.nextInt();

            // Sayının karesi hesaplanır ve ekrana yazdırılır.
            System.out.print(ussuAlinanSayi + " sayisinin ussu: ");
            ussuAlinanSayi *= ussuAlinanSayi;
            System.out.println(ussuAlinanSayi);
        }

        // Scanner sınıfı kapatılır.
        sc.close();
    }
}
