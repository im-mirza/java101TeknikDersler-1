import java.util.Arrays;
import java.util.Scanner;

public class DizidekiSyailariKucuktenBuyuyeSiralama {
    public static void main(String[] args) {
        // Diziyi oluştur
        int[] arr = new int[5];


        // Dizinin boyutunu ekrana yazdır
        System.out.println("Dizinin Boyutu: " + arr.length);

        // Kullanıcıdan dizinin elemanlarını al
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizinin elemanlarını girin:");

        for (int i = 0; i < arr.length; i++) {
            // Kullanıcıdan her elemanı al
            System.out.print((i + 1) + ". Elemani: ");
            arr[i] = sc.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(arr);

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(arr));
    }
}
