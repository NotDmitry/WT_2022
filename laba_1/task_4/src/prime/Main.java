package prime;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final int N = 20;
        var testArray = new int[N];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = ThreadLocalRandom.current().nextInt(0, 1000);
        }
        System.out.print(Arrays.toString(testArray)+"\n Prime are numbers: ");
        for (int i = 0; i < testArray.length; i++) {
            if (isPrime(testArray[i]))
                System.out.print(i+" / ");
        }
    }

    public static boolean isPrime(int n) {

        if((n > 2 && n % 2 == 0) || n == 1) {
            return false;
        }

        for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}