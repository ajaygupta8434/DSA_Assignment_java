public class LinearSearch_2 {
    static int searchInRange(int[] arr, int x, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9};
        int x = 1;
        System.out.println("Index in range 1-3: " + searchInRange(arr, x, 1, 3)); // 3
    }
}