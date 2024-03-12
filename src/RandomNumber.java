import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(100_011 - 11) + 11;
        System.out.println("Рандомне число: " + randomNum);

        int sum = 0;
        for(int n = randomNum; n != 0; n /= 10) {
            sum += (n % 10);
        }
        System.out.println("Сума розрядів: " +  sum);
    }
}
