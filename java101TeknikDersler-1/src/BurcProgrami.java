import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {

        // Kullanıcıdan doğum günü bilgilerini almak için Scanner sınıfını kullanıyoruz.
        int gun, ay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen Dogdugunuz Ayi Girin(sayi olarak):");
        ay = sc.nextInt();
        System.out.println("Lutfen Dogdugunuz Gununuzu Girin:");
        gun = sc.nextInt();

        // Burçları belirlemek için koşullu ifadeleri kullanıyoruz.
        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("Koc Burcusunuz");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            System.out.println("Boga Burcusunuz");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.println("Ikizler Burcusunuz");
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.println("Yengec Burcusunuz");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("Aslan Burcusunuz");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("Basak Burcusunuz");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("Terazi Burcusunuz");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("Akrap Burcusunuz");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("Yay Burcusunuz");
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            System.out.println("Oglak Burcusunuz");
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            System.out.println("Kova Burcusunuz");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println("Balik Burcusunuz");
        }

        // Scanner sınıfını kapatıyoruz.
        sc.close();
    }
}
