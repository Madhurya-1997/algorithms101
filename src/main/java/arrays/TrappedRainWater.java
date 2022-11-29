package arrays;

public class TrappedRainWater {


    public static int totalTrappedWater(int[] arr) { // O(n^2)
        int sum=0;

        for(int i=1; i<=arr.length - 2; i++) {
            int maxHeightLeft = maxHeightLeftInclusive(arr, i);
            int maxHeightRight = maxHeightRightInclusive(arr, i);
            int minTrappedWater = Math.min(maxHeightLeft, maxHeightRight);

            sum += minTrappedWater - arr[i];
        }
        return sum;
    }

    public static int totalTrappedWaterOptimized(int[] arr) {
        int sum=0;
        int[] left = new int[arr.length];
        left[0] = arr[0];
        int[] right = new int[arr.length];
        right[right.length-1] = arr[arr.length-1];

        for(int i=1; i<arr.length; i++) {
            left[i] = Math.max(arr[i], left[i-1]);
        }
        for(int i=arr.length-2; i>=0; i--) {
            right[i] = Math.max(arr[i], right[i+1]);
        }

        for (int i=0; i<arr.length; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }

        return sum;
    }

    private static int maxHeightLeftInclusive(int[] arr, int index) {
        int maxVal = 0;
        for (int i=0; i<=index; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    private static int maxHeightRightInclusive(int[] arr, int index) {
        int maxVal = 0;
        for (int i=index; i<arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
