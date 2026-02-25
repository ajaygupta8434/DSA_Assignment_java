public class LinearSearch8 {
    static int firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return arr[i];
            }
        }
        return -1; // No repeating element
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5};
        System.out.println("First repeating element: " + firstRepeating(arr)); // 5
    }
}