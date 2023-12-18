import java.util.ArrayList;
import java.util.Scanner;

public class DordVeBesinKuvvetleriniYazdiranProgram {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak sayıyı tutan değişken
        int girilenSayi;

        // 4. kuvvetleri tutan liste
        ArrayList<Double> d_ussu = new ArrayList<>();

        // 5. kuvvetleri tutan liste
        ArrayList<Double> b_ussu = new ArrayList<>();

        // Kullanıcıdan sayı alınır
        System.out.println("Bir rakam girin:");
        Scanner sc = new Scanner(System.in);
        girilenSayi = sc.nextInt();

        // Girilen sayıya kadar olan sayıların 4. ve 5. kuvvetleri hesaplanıp listelere eklenir
        for (int i = 1; i < girilenSayi; i++) {
            d_ussu.add(Math.pow(i, 4));
            b_ussu.add(Math.pow(i, 5));
        }

        // 4. kuvvetleri ekrana yazdırma
        System.out.println(girilenSayi + "'in 4. kuvvetleri:");
        for (double a : d_ussu) {
            System.out.println(a);
        }

        // 5. kuvvetleri ekrana yazdırma
        System.out.println(girilenSayi + "'in 5. kuvvetleri:");
        for (double a : b_ussu) {
            System.out.println(a);
        }

        // Scanner'ı kapat
        sc.close();
    }
}
