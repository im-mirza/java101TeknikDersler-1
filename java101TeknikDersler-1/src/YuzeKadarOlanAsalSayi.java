public class YuzeKadarOlanAsalSayi {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            // Sayının 2 ile kendisi arasındaki sayılara bölünüp bölünmediğini kontrol et
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(i + " ");
                
            }
        }
    }
}
