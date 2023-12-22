import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum(int a,int b){
        int result=a+b;
        return result;
    }
    public static void main(String[] args) {
        int select;
        Scanner sc = new Scanner(System.in);

        System.out.println("1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Ustlu sayi hesaplama\n"
                + "6- Mod alma\n"
                + "7- Dikdortken Alan ve Cevre Hesabi\n"
                + "0- Cikis yap\n");

        do {
            System.out.println("Bir islem seciniz");
            select=sc.nextInt();
        }while (select!=0);
    }
}
