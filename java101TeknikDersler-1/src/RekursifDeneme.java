public class RekursifDeneme {

    static void kuralaUyanDongu(int a, int b, boolean c) {
        // Kurala göre işlem yap
        if (a > 0 && c == true) {
            System.out.println(a + " ");
            kuralaUyanDongu(a - 5, b, true);
        } else {
            if (a <= b) {
                System.out.println(a + " ");
                kuralaUyanDongu(a + 5, b, false);
            }
        }
    }

    public static void main(String[] args) {

        // Metot çağrısı
        kuralaUyanDongu(16, 16, true);


    }
}
