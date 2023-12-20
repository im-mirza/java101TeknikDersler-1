public class YildizlarlaElmaz {
    public static void main(String[] args) {
        // İlk yarım elması oluşturan döngüler
        for (int i = 0; i < 6; i++) {
            // Boşlukları eklemek için iç içe döngü
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları eklemek için iç içe döngü
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Satır sonu
        }

        // İkinci yarım elması oluşturan döngüler
        for (int i = 0; i < 6; i++) {
            // Boşlukları eklemek için iç içe döngü
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }
            // Yıldızları eklemek için iç içe döngü
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Satır sonu
        }
    }
}
