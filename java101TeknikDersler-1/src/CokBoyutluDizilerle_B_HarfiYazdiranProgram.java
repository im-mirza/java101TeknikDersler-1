public class CokBoyutluDizilerle_B_HarfiYazdiranProgram {
    public static void main(String[] args) {

        // 7 satır, 4 sütundan oluşan bir çok boyutlu dizi oluşturuluyor
        String[][] arr = new String[7][4];

        // Döngülerle dizinin her elemanına değer atanıyor
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // B harfinin oluşturulması için koşullar belirleniyor
                if (i == 0 || i == 3 || i == 6) {
                    arr[i][j] = "* ";
                } else if (j == 0 || j == 3) {
                    arr[i][j] = " * ";
                } else {
                    // Belirlenen koşullar dışındaki hücrelere boşluk atanıyor
                    arr[i][j] = "  ";
                }
            }
        }

        // Oluşturulan dizinin içeriği ekrana yazdırılıyor
        for (String row[] : arr) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
