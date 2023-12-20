import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        // Harmonik serinin toplamını hesaplamak için kullanılacak değişkenler tanımlanır.
        double result = 0;

        // Kullanıcıdan n sayısını almak için Scanner sınıfı kullanılır.
        Scanner sc = new Scanner(System.in);
        System.out.println("n sayisni giriniz");
        int n = sc.nextInt();

        // Harmonik serinin toplamını hesaplamak için bir döngü kullanılır.
        for (int i = 1; i <= n; i++) {
            // Her bir terimi toplam değişkenine eklenir.
            result += (1.0 / i);
        }

        // Harmonik serinin toplamı ekrana yazdırılır.
        System.out.println(result);

        // Scanner sınıfı kapatılır.
        sc.close();
    }
}
