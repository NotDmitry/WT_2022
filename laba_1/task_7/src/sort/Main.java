package sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        final int N = 30;
        var inputArray = new double[N];
        for (int i = 0; i < inputArray.length; i++)
            inputArray[i] = ThreadLocalRandom.current().nextDouble(0, 1000);
        System.out.println("Unsorted array: " + Arrays.toString(inputArray));

    int pointer = 0;
    double temp = 0;


    while (pointer < inputArray.length - 1){
        if (inputArray[pointer] > inputArray[pointer + 1]){
            temp = inputArray[pointer];
            inputArray[pointer] = inputArray[pointer + 1];
            inputArray[pointer + 1] = temp;
            if (pointer != 0)
                pointer--;
        }
        else
            pointer++;
    }

        System.out.println("Sorted array: " + Arrays.toString(inputArray));
    }
}