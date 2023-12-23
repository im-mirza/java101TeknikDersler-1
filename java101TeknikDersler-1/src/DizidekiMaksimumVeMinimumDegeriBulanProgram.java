import java.util.Arrays;

public class DizidekiMaksimumVeMinimumDegeriBulanProgram {
    public static void main(String[] args) {
        // Dizi oluşturuluyor
        int[] arr = {10, 45, 195, 25, -1, 12, 2, 5, 58};

        // Maksimum ve minimum değerleri tutacak değişkenler tanımlanıyor
        int maxDeger = 0;
        int minDeger = 0;

        // Maksimum değeri bulan döngü
        for (int i = 0; i < arr.length; i++) {
            if (maxDeger < arr[i]) {
                maxDeger = arr[i];
            }
        }

        // Minimum değeri bulan döngü
        minDeger = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minDeger > arr[i]) {
                minDeger = arr[i];
            }
        }

        // Sonuçlar ekrana yazdırılıyor
        System.out.println("Max Deger: " + maxDeger);
        System.out.println("Min Deger: " + minDeger);
    }
}
