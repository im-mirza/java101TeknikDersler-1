public class MatrisTranspozu {

    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Matrisin boyutlarını al
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Matris transpozu için yeni bir array oluştur
        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Matris transpozunu hesapla
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Matris ve transpozunu ekrana yazdır
        System.out.println("Orjinal Matris:");
        matrisiYazdir(matris);

        System.out.println("\nMatris Transpozu:");
        matrisiYazdir(transpoz);
    }

    // Matrisi ekrana yazdırmak için yardımcı bir fonksiyon
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
