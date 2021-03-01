import java.util.Arrays;
import java.util.Random;

public class Run1 {
    public static void main(String[] args) {
        int[] ar = create(15);

        print(ar, ",");

        Arrays.sort(ar);
        System.out.println();

        print(ar, ";");
    }

    public static void print(int[] mas, String separator) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + separator);
        }
    }

    public static int[] create(int n) {
        int[] ar = new int[n];
        Random r = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt(10);
        }
        return ar;
    }
}
