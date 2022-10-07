package matrix;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        final int N = 12;
        var testArray = new int[N][N];
        for (int i = 0; i < testArray.length; i++) {
            testArray[0][i] = ThreadLocalRandom.current().nextInt(0, 1000);
        }
        System.out.println(Arrays.toString(testArray[0]));

        for (int i = 1; i < testArray.length; i++) {
            for (int j = 0; j < testArray[0].length; j++)
                testArray[i][j] = testArray[i - 1][(j + 1) % testArray.length];
            System.out.println(Arrays.toString(testArray[i]));
        }

    }
}