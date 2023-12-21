public class Polindrom {
    public static void main(String[] args) {
        // Test için bir sayının palindrom olup olmadığını kontrol eden method'u çağırıyoruz
        System.out.println(isPolindrom(242));
    }

    // Bir sayının palindrom olup olmadığını kontrol eden method
    public static boolean isPolindrom(int number) {
        // Değişkenleri tanımlıyoruz
        int reverseNumber = 0, lastDigit, temp = number;

        // Sayının tersini alma işlemi için while döngüsü kullanılır
        while (temp != 0) {
            // Sayının son basamağını alıyoruz
            lastDigit = temp % 10;
            // Sayının tersini oluşturuyoruz
            reverseNumber = (reverseNumber * 10) + lastDigit;
            // Sayının son basamağını çıkararak işleme devam ediyoruz
            temp = temp / 10;
        }

        // Sayı palindromsa true, değilse false değeri döndürülür
        return reverseNumber == number;
    }
}
