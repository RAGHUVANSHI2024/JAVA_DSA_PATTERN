import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubArraySumAtLeastK862 {
    public static int findShortestSubarrayWithTarget(int[] arr, int target) {
        int n = arr.length;

        long[] prefixSums = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + arr[i];
        }

        int minLength = Integer.MAX_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < prefixSums.length; right++) {

            while (!deque.isEmpty() && prefixSums[right] - prefixSums[deque.peekFirst()] >= target) {
                minLength = Math.min(minLength, right - deque.pollFirst());
            }

            while (!deque.isEmpty() && prefixSums[right] <= prefixSums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.addLast(right);
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 3};
        int target = 3;
        System.out.println("Shortest window length: " + findShortestSubarrayWithTarget(arr, target));
        // Output will be 1 (the single element [3] at the end)
    }
}
