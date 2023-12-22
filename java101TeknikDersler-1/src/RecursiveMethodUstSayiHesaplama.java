public class RecursiveMethodUstSayiHesaplama {

    // Recursive metot: a üzeri b hesaplama
    static int ustAlma(int a, int b) {
        if (b < 0) {
            // Negatif üs durumu için
            int tempB = -b;
            System.out.print("1/"); // Sonucun kesirli bir şekilde yazdırılması
            return (a * ustAlma(a, (tempB - 1)));

        } else if (b > 0) {
            // Pozitif üs durumu için
            return a * ustAlma(a, b - 1);
        } else {
            // b = 0 durumu, herhangi bir sayı 0'a bölündüğünde sonuç 1 olur
            return 1;
        }
    }

    public static void main(String[] args) {
        // Test için 2 üzeri 3'ü hesaplama
        System.out.println(ustAlma(2, 3));
    }
}
