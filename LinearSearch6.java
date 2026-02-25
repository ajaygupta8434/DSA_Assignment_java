public class LinearSearch6 {
    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        int x = 2;
        System.out.println(x + " occurs " + countOccurrences(arr, x) + " times"); // 3
    }
}