import java.util.Arrays;

public class DizidekiTekrarEdenSayilariYazdiranProgram {

    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 2, 3, 3, 4, 5, 6, 6, 7, 7, 8, 8};
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {

            }

        }


        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[startIndex++] = list[i];
                    }

                    break;

                }
            }
        }
        System.out.println(Arrays.toString(dublicate));
    }
}
