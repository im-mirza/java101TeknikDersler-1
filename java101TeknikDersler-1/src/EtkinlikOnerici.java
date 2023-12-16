import java.util.Scanner;

public class EtkinlikOnerici {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sıcaklık Değerini Girin: ");
        int sicaklik = sc.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneririz.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema etkinliğini öneririz.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik etkinliğini öneririz.");
        } else {
            System.out.println("Yüzme etkinliğini öneririz.");
        }
    }
}
