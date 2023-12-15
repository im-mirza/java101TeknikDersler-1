import java.util.Scanner;

public class HespaMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,select;

        // Scanner sınıfı ile kullanıcıdan giriş alınır.
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan ilk tam sayı girişi istenir.
        System.out.println("1. Sayiyi Girin");
        sayi1=sc.nextInt();

        // Kullanıcıdan ikinci tam sayı girişi istenir.
        System.out.println("2. Sayiyi Girin");
        sayi2=sc.nextInt();

        // Kullanıcıya dört temel matematiksel işlem seçeneğini gösterme.
        System.out.println("1-Toplama\n2-Cikma\n3-Carpma\n4-Bolma");
        System.out.println("Seciniz:");

        // Kullanıcının seçimini alınır.
        select=sc.nextInt();


        // Switch-case yapısı ile kullanıcının seçimine göre işlem yapar.
        switch (select){
            case 1:
                System.out.println(sayi1+"+"+sayi2+"= "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println(sayi1+"-"+sayi2+"= "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println(sayi1+"*"+sayi2+"= "+ (sayi1*sayi2));
                break;
            case 4:
                System.out.println(sayi1+"/"+sayi2+"= "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlis secim etdiniz");
                break;

        }

    }
}
