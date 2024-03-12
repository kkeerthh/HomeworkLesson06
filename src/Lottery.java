import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
      byte sizeOfArr = 7;
        Random randomNumbers = new Random();
        int[] firstArr = new int[sizeOfArr];
        int[] secondArr = new int[sizeOfArr];

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = randomNumbers.nextInt(10);
        }

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = randomNumbers.nextInt(10);
        }

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));


        int coincidence = 0;
        for (int i = 0; i < sizeOfArr; i++) {
            if (firstArr[i] == secondArr[i]) {
                coincidence++;
            }
        }

        System.out.println("Кількість збігів: " + coincidence);


    }
}
