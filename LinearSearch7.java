public class LinearSearch7 {
    static int findMissingNumber(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1; // No missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        System.out.println("Missing number: " + findMissingNumber(arr, n)); // 3
    }
}