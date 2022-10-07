import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import subsequence.*;

public class Main {
    public static void main(String[] args) {
        final int N = 20;
        var inputSequence = new int[N];
        for (int i = 0; i < inputSequence.length; i++)
            inputSequence[i] = ThreadLocalRandom.current().nextInt(0, 1000);
        System.out.println(Arrays.toString(inputSequence));
        System.out.println("Amount to delete is : " +
                (inputSequence.length-LongestSubsequenceFinder.longestSubLength(inputSequence)));

    }
}