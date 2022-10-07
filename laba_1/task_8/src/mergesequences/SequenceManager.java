package mergesequences;

public class SequenceManager {

    public static double[] mergeSequences(double[] firstSeq, double[] secondSeq) {
        int i = 0, j = 0, k = 0;
        int n1 = firstSeq.length;
        int n2 = secondSeq.length;
        var result = new double[n1+n2];
        // Traverse both array
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (firstSeq[i] < secondSeq[j])
                result[k++] = firstSeq[i++];
            else
                result[k++] = secondSeq[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            result[k++] = firstSeq[i++];

        // Store remaining elements of second array
        while (j < n2)
            result[k++] = secondSeq[j++];
        return result;
    }

}