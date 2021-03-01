import java.util.Random;

public class Run {
    public static void main(String[] args) {
        int[][] ar = new int[4][4];

        Random r = new Random();
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i >= j) {
                    if (ar[i][j] % 2 == 1) {
                        System.out.print(ar[i][j] + " ");
                    }
                }
            }
        }
    }
}
