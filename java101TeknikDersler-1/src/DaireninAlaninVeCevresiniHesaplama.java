import java.util.Scanner;

public class DaireninAlaninVeCevresiniHesaplama {
    public static void main(String[] args) {
        int r;
        final double pi=3.14;

        Scanner sc= new Scanner(System.in);
        System.out.println("Dairenin Yari Capini Giriniz:");
        r=sc.nextInt();

        double alan =pi*r*r;
        double cevre=2*pi*r;

        System.out.println("Dairenin alani: "+alan);
        System.out.println("Dairenin Cevresi: "+cevre);

    }
}