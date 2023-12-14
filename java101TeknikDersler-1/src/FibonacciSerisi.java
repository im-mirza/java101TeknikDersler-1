import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int girilenSayi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi Gir");
        girilenSayi=sc.nextInt();
        System.out.println(fibonachi(girilenSayi));

    }


    public static int fibonachi(int n){
        if(n<=1){
            return 1;
        }else {
            return fibonachi(n-1)+fibonachi(n-2);
        }
    }

}
