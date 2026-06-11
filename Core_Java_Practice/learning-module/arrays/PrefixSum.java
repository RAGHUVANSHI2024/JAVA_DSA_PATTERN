public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, -1, 3, 5, -2};
        int n = arr.length;

        long[] prefixSums = new long[n + 1];


        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + arr[i];
        }


        System.out.print("Original Array: ");
        for(int num : arr) System.out.print(num + " ");

        System.out.print("\nPrefix Array:   ");
        for(long num : prefixSums) System.out.print(num + " ");

        System.out.println("\n");

        // Let's find the sum from index 1 (value -1) to index 3 (value 5)
        // Expected sum: -1 + 3 + 5 = 7
        int i = 1;
        int j = 3;

        long instantSum = prefixSums[j + 1] - prefixSums[i];

        System.out.println("Sum from index " + i + " to " + j + " is: " + instantSum);
    }
}
