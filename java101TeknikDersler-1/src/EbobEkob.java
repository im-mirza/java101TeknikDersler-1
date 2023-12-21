import java.util.Scanner;

public class EbobEkob {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayıyı almak için Scanner sınıfı kullanılıyor.
        int a, b, ebob = 1, ekob = 1;
        Scanner sc = new Scanner(System.in);

        // Kullanıcıya iki sayı girmesi için talimat veriliyor.
        System.out.println("İki Sayı Girin");
        System.out.println("1. sayı:");
        a = sc.nextInt();
        System.out.println("2. sayı:");
        b = sc.nextInt();

        int i = 1;

        // Ebob hesaplaması için do-while döngüsü kullanılıyor.
        do {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        } while (i <= a);

        // Ekob hesaplanıyor.
        ekob = (a * b) / ebob;

        // Sonuçlar ekrana yazdırılıyor.
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekob: " + ekob);
    }
}
