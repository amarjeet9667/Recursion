public class MergeTwoArray {

    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9};
        int[] y = {2, 4, 6, 8, 10};

        int[] merged = new int[x.length + y.length];
        mergeRecursive(x, y, merged, 0, 0, 0);

        // Print merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    // Recursive function
    public static void mergeRecursive(int[] x, int[] y, int[] result, int i, int j, int k) {
        // Base case: if both arrays are done
        if (i == x.length && j == y.length) {
            return;
        }

        // If x is exhausted, take from y
        if (i == x.length) {
            result[k] = y[j];
            mergeRecursive(x, y, result, i, j + 1, k + 1);
        }
        // If y is exhausted, take from x
        else if (j == y.length) {
            result[k] = x[i];
            mergeRecursive(x, y, result, i + 1, j, k + 1);
        }
        // Compare and pick smaller
        else if (x[i] < y[j]) {
            result[k] = x[i];
            mergeRecursive(x, y, result, i + 1, j, k + 1);
        } else {
            result[k] = y[j];
            mergeRecursive(x, y, result, i, j + 1, k + 1);
        }
    }
}

