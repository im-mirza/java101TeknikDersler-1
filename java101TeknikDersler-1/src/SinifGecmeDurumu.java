import java.util.ArrayList;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] dersler = {"matematik", "fizik", "kimya", "bioloji"};
        int toplamNot = 0;
        ArrayList<Integer> notlar = new ArrayList<>();

        // Kullanıcıdan her bir ders için not girişi isteniyor.
        for (int i = 0; i < dersler.length; i++) {
            System.out.println(dersler[i] + " Dersini Notunu Gir: ");
            int girilenNot = sc.nextInt();
            // Girilen notun 0 ile 100 arasında olup olmadığı kontrol ediliyor.
            if (girilenNot > 0 && girilenNot < 100) {
                notlar.add(girilenNot);
            }
        }

        // Notların toplamı hesaplanıyor.
        for (int not : notlar) {
            toplamNot += not;
        }

        // Notların ortalaması hesaplanıyor.
        double avarage = toplamNot / notlar.size();

        // Ortalama ekrana yazdırılıyor.
        System.out.println("Ortalamaniz: " + avarage);
    }
}
