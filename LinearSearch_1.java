public class LinearSearch_1 {
    static int basicSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9};
        int x = 7;
        System.out.println("Index of " + x + ": " + basicSearch(arr, x)); // 2
    }
}