import java.util.Scanner;

public class EtkinlikOnerici_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sıcaklık Değerini Girin: ");
        int sicaklik = sc.nextInt();

        // Sıcaklık aralıklarını tanımlayan dizi
        int[] araliklar = { 5, 15, 25};

        // Etkinlikleri tanımlayan dizi
        String[] etkinlikler = {"Sinema", "Piknik", "Yüzme"};

        // Sıcaklık aralığına göre etkinliği bulma
        for (int i = 0; i < araliklar.length; i++) {
            if(sicaklik < 5){
                System.out.println("Kayak Oneriyoruz");
                break;
            }
            else if (sicaklik < araliklar[i]) {
                System.out.println(etkinlikler[i] + " etkinliğini öneririz.");
                break;
            }
        }
    }
}
