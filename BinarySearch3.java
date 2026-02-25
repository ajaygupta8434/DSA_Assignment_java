public class BinarySearch3 {

    static int countOccurrences(int[] arr, int target) {
        int first = BinarySearch2.firstOccurrence(arr, target);
        if (first == -1) return 0; // Not found
        int last = BinarySearch2.lastOccurrence(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        System.out.println("Count of " + target + ": " + countOccurrences(arr, target)); // 3
    }
}