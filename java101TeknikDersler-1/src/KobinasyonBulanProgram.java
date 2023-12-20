public class KobinasyonBulanProgram {
    public static void main(String[] args) {
        // Kombinasyon hesaplamak için kobinasyonBulma fonksiyonu çağrılır.
        kobinasyonBulma(5, 3);
    }

    // Faktöriyel hesaplamak için kullanılan fonksiyon.
    public static int faktorielBulma(int a) {
        int faktoriel = 1;
        // Faktöriyel hesaplanır.
        for (int i = 1; i <= a; i++) {
            faktoriel *= i;
        }
        return faktoriel;
    }

    // C(n,r) = n! / (r! * (n-r)!) formülü ile kombinasyon hesaplanır.
    public static void kobinasyonBulma(int a, int b) {
        int kombinasyon;
        kombinasyon = faktorielBulma(a) / (faktorielBulma(b) * faktorielBulma(a - b));
        // Sonuç ekrana yazdırılır.
        System.out.println("Kombinasyon C(" + a + ", " + b + ") = " + kombinasyon);
    }
}
