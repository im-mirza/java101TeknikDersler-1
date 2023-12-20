import java.util.Scanner;

public class BasamakSayilariniToplayanProgram {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak sayı ve basamakların toplamını tutmak için değişkenler tanımlanır.
        int girilenSayi, toplam = 0;

        // Kullanıcıdan sayı almak için Scanner sınıfı kullanılır.
        Scanner sc = new Scanner(System.in);
        System.out.println("Basamaklarini toplamak istediginiz sayini girin: ");
        girilenSayi = sc.nextInt();

        // Sayının her basamağını toplamak için bir döngü kullanılır.
        while (girilenSayi != 0) {
            toplam += (girilenSayi % 10); // Sayının birler basamağını toplama eklenir.
            girilenSayi /= 10; // Sayının birler basamağından kurtulunur.
        }

        // Toplam sonucu ekrana yazdırılır.
        System.out.println("Toplam: " + toplam);

        // Scanner sınıfı kapatılır.
        sc.close();
    }
}
