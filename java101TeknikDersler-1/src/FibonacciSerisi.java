import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak sıra sayısı için bir değişken tanımlanıyor.
        int girilenSayi;

        // Scanner sınıfı ile kullanıcıdan veri almak için bir nesne oluşturuluyor.
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan bir sayı isteniyor.
        System.out.println("Bir sayi Gir");
        girilenSayi = sc.nextInt();

        // Girilen sayıya kadar olan Fibonacci serisini hesaplayıp ekrana yazdırma işlemi
        System.out.println(fibonachi(girilenSayi)); 

    }


    // Recursive bir şekilde Fibonacci serisini hesaplayan fonksiyon
    public static int fibonachi(int n) {
        // Base case: Eğer n 1 veya daha küçükse, 1'i geri döndür.
        if (n <= 1) {


            return 1;
        } else {
            // Recursive adımlar: n-1 ve n-2 için fibonachi fonksiyonunu çağırarak topla.
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}
