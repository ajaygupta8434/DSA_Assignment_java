public class Array_assignment_11 {

    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 5, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Decide: continue previous subarray or start new
            if (currentSum + arr[i] > arr[i]) {
                currentSum = currentSum + arr[i];
            } else {
                currentSum = arr[i];
            }

            // Update maximum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}