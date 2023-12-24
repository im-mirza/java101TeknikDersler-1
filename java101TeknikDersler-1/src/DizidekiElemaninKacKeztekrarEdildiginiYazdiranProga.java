import java.util.Arrays;

public class DizidekiElemaninKacKeztekrarEdildiginiYazdiranProga {
    public static void main(String[] args) {

                int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

                for (int i = 0; i < dizi.length; i++) {
                    if (dizi[i] == -1) {
                        continue; // Bu eleman zaten sayıldı, devam et
                    }

                    int frekans = 1;
                    for (int j = i + 1; j < dizi.length; j++) {
                        if (dizi[i] == dizi[j]) {
                            frekans++;
                            dizi[j] = -1; // Aynı elemanı bir daha saymamak için işaret koy
                        }
                    }

                    System.out.println(dizi[i] + " sayısı " + frekans + " kere tekrar edildi.");
                }
            }
        }




