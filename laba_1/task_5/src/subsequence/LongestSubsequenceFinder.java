package subsequence;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class LongestSubsequenceFinder {
    static int findBorder(int[] inputArray, int left, int right, int key)
    {
        while (right - left > 1) {
            int middle = left + (right - left) / 2;
            if (inputArray[middle] >= key)
                right = middle;
            else
                left = middle;
        }

        return right;
    }

    static public int longestSubLength(int[] inputSequence)
    {
        int size = inputSequence.length;
        var tailTable = new int[size];
        int resultLength = 1;

        tailTable[0] = inputSequence[0];
        for (int i = 1; i < size; i++) {
            if (inputSequence[i] < tailTable[0])

                tailTable[0] = inputSequence[i];

            else if (inputSequence[i] > tailTable[resultLength - 1])

                tailTable[resultLength++] = inputSequence[i];

            else

                tailTable[findBorder(tailTable, -1, resultLength - 1, inputSequence[i])] = inputSequence[i];
        }

        return resultLength;
    }
}
