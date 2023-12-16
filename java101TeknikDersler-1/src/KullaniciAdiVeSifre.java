import java.util.Scanner;

public class KullaniciAdiVeSifre {
    public static void main(String[] args) {
        // Kullanıcı adı, şifre ve diğer değişkenleri tanımlama
        String password, username, yesOrNot, newPassword;

        // Kullanıcıdan veri almak için Scanner nesnesi oluşturma
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan kullanıcı adını alma
        System.out.println("Lutfen Kullanici Adinizi Girin: ");
        username = sc.nextLine();

        // Kullanıcıdan şifreyi alma
        System.out.println("Lutfen Sifrenizi Girin: ");
        password = sc.nextLine();

        // Kullanıcı adının "patika" olup olmadığını kontrol etme
        if (username.equalsIgnoreCase("patika")) {
            // Şifrenin "Patika" olup olmadığını kontrol etme
            if (password.equals("Patika")) {
                System.out.println("Ugurlu Giris Yaptiniz");
            } else {
                // Yanlış şifre girildiyse şifre sıfırlama isteği alma
                System.out.println("Yanlis sifre girdiniz: Sifrenizi sifirlamak istiyormusunuz ?");
                yesOrNot = sc.nextLine();

                // Şifre sıfırlama isteğinin "evet" olup olmadığını kontrol etme
                if (yesOrNot.equalsIgnoreCase("evet")) {
                    // Yeni şifreyi alma
                    System.out.println("Yeni Olusturacaginiz sifreni girin");
                    newPassword = sc.nextLine();

                    // Yeni şifrenin "Patika" olup olmadığını kontrol etme ve doğru şifre girilene kadar tekrar alma
                    while (newPassword.equals("Patika")) {
                        System.out.println("Yeni Sifreniz hatali, eski sifre ile ayni olmamali gerekir:" +
                                "Lutfen farkli sifre girin");
                        newPassword = sc.nextLine();

                        // Doğru şifre girildiyse mesaj yazdırma
                        if (!newPassword.equals("Patika")) {
                            System.out.println("Yeni Sifreniz Olusturuldu");
                        }
                    }

                    // Şifre sıfırlama işlemi tamamlandıktan sonra veda mesajı yazdırma
                    if (yesOrNot.equalsIgnoreCase("hayir")) {
                        System.out.println("Gule-Gule");
                    }
                }
            }
        }
    }
}
