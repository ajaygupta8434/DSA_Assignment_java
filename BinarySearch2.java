public class BinarySearch2 {

    static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1; // search left
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // search right
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        System.out.println("First occurrence: " + firstOccurrence(arr, target)); // 1
        System.out.println("Last occurrence: " + lastOccurrence(arr, target));   // 3
    }
}