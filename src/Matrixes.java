import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrixes {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value M: ");
        int m = scanner.nextInt();
        System.out.print("Enter value N: ");
        int n = scanner.nextInt();

        int[][] array2DOriginal = new int[m][n];
        int[][] array2DTransported = new int[n][m];

        System.out.println("Original matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2DOriginal[i][j] = randomNum.nextInt(10);
               System.out.print(array2DOriginal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transported matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2DTransported[i][j] = array2DOriginal[j][i];
                System.out.print(array2DTransported[i][j] + " ");
            }
            System.out.println();
        }
    }
}
