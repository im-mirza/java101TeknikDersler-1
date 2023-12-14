import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int girilenSayi, saygac=0,j=0;;

        // Kullanıcıdan sayı almak için bir Scanner nesnesi oluşturuluyor.
        Scanner sc= new Scanner(System.in);

        // Kullanıcıdan bir sayı isteniyor.
        System.out.println("Bir sayi Girin");
        girilenSayi=sc.nextInt();

        // 0'dan girilen sayıya kadar olan sayıları kontrol etmek için bir for döngüsü kullanılıyor.
        for (int i=0;i<=girilenSayi;i++){
             if(i%3==0&&i%4==0){//12+24+36+48


                 // Bölünebilen sayıları toplamak için saygac değişkeni güncelleniyor.
                 saygac+=i;
                 // Kaç tane sayının bulunduğunu saymak için j değişkeni arttırılıyor.
                 j++;

            }


        }

        // Girilen sayının 3'e ve 4'e bölünenlerinin ortalamasını hesaplayıp ekrana yazdırma işlemi
        System.out.println(girilenSayi+"nin- 3 ve 4 de bolunenlerinin ortalamasi: "+saygac/(j-1));

    }
}
