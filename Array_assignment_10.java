public class Array_assignment_10 {
    

    public static void rotateRight(int arr[], int k) {
        int n = arr.length;

        k = k % n;  // agar k > n ho to handle karega

        int newArr[] = new int[n];

        // Last k elements ko starting me daal do
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[n - k + i];
        }

        // Baaki elements shift karo
        for (int i = k; i < n; i++) {
            newArr[i] = arr[i - k];
        }

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        System.out.println("Bofore Rotate:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Rotate:");
        rotateRight(arr, k);
    }
}
