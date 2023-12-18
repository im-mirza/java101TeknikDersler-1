import java.util.Scanner;

public class SayilariKucuktenBuyuyeSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("3 Tane Sayi Giriniz: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print(a + " ");
            if (b > c) {
                System.out.print(b + " ");
                System.out.print(c + " ");
            } else {
                System.out.print(c + " ");
                System.out.print(b);
            }
        } else if (b > a && b > c) {
            System.out.print(b + " ");
            if (a > c) {
                System.out.print(a + " ");
                System.out.print(c + " ");
            } else {
                System.out.print(c + " ");
                System.out.print(a);
            }

        } else if (c > a && c > b) {
            System.out.print(c + " ");
            if (b > a) {
                System.out.print(b + " ");
                System.out.print(a + " ");
            } else {
                System.out.print(a + " ");
                System.out.print(b);
            }
        }
    }
}