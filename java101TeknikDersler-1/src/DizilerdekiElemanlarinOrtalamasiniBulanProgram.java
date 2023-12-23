public class DizilerdekiElemanlarinOrtalamasiniBulanProgram {

    public static void main(String[] args) {
        // Dizi oluşturuluyor
        int[] arr = {1, 5, 5, 34, 7};

        // Ortalama ve toplam değişkenleri tanımlanıyor
        double average = 0.0, toplam = 0.0;

        // Dizideki elemanların toplamı hesaplanıyor
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }

        // Ortalama hesaplanıp ekrana yazdırılıyor
        System.out.println("Dizideki Elemanların Ortalaması: " + toplam / arr.length);
    }
}
