import mergesequences.*;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final int N = 7;
        final int M = 10;
        var first = new double[N];
        var second = new double[M];
        for (int i = 0; i < first.length; i++)
            first[i] = ThreadLocalRandom.current().nextDouble(0, 1000);
        System.out.println("Sequence A: " + Arrays.toString(first));
        for (int i = 0; i < second.length; i++)
            second[i] = ThreadLocalRandom.current().nextDouble(0, 1000);
        System.out.println("Sequence B: " + Arrays.toString(second));

        var resultSequence = SequenceManager.mergeSequences(first, second);
        System.out.println("New sequence: " + Arrays.toString(resultSequence));
    }
}