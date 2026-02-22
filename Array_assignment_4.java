public class Array_assignment_4 {

    public static void removeDuplicate(int arr[]) {

        if (arr.length == 0) {
            System.out.println("Array is Empty");
            return;
        }

        int i = 0; // slow pointer

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Print only unique elements
        System.out.println("Array after removing duplicates:");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3, 4, 4};
        removeDuplicate(arr);
    }
}