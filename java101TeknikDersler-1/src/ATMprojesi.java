import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {

        // Kullanıcı adı, şifre, giriş hakkı, bakiye ve seçim değişkenleri tanımlanıyor.
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select, price;

        // Giriş hakkı 0 olana kadar kullanıcıya giriş hakkı veriliyor.
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            // Kullanıcı adı ve şifre kontrolü yapılıyor.
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                // Kullanıcı işlem yapmak istediği sürece döngü devam ediyor.
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    // Kullanıcının seçimine göre işlemler yapılıyor.
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                } while (select != 4);

                // Çıkış yapıldığında tekrar görüşme mesajı yazdırılıyor.
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                // Hatalı giriş durumunda kullanıcının giriş hakkı düşürülüyor.
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
