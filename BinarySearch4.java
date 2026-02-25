public class BinarySearch4 {

    static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                result = arr[mid];  // potential floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                result = arr[mid];  // potential ceiling
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 6;
        System.out.println("Floor of " + target + ": " + floor(arr, target));   // 5
        System.out.println("Ceiling of " + target + ": " + ceiling(arr, target)); // 7
    }
}