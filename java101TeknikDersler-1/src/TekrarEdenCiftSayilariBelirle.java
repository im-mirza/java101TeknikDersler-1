import java.util.Arrays;

public class TekrarEdenCiftSayilariBelirle {
    public static void main(String[] args) {
        // Kaynak dizimiz
        int[] kaynakDizi = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 12, 14, 16, 18, 20, 20};

        // Tekrar eden çift sayıları tutacak olan dizi
        int[] tekrarEdenCiftSayilar = new int[kaynakDizi.length];
        int tekrarEdenCiftSayilarIndex = 0;

        // Dizi üzerinde dolaşarak tekrar eden çift sayıları bulma
        for (int i = 0; i < kaynakDizi.length; i++) {
            int currentNumber = kaynakDizi[i];
            if (currentNumber % 2 == 0) {
                for (int j = i + 1; j < kaynakDizi.length; j++) {
                    if (currentNumber == kaynakDizi[j]) {
                        // Eğer tekrar eden çift sayı bulunursa, diziye eklenir
                        tekrarEdenCiftSayilar[tekrarEdenCiftSayilarIndex] = currentNumber;
                        tekrarEdenCiftSayilarIndex++;
                        break;
                    }
                }
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Kaynak Dizi: " + Arrays.toString(kaynakDizi));

        // Tekrar eden çift sayıları içeren kısmı alarak yeni bir dizi oluştur
        int[] sonucDizi = Arrays.copyOf(tekrarEdenCiftSayilar, tekrarEdenCiftSayilarIndex);
        System.out.println("Tekrar Eden Çift Sayılar: " + Arrays.toString(sonucDizi));
    }
}
