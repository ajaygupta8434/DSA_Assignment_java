public class Array_assignment_7 {

    public static void checkSorted(int[] arr) {

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }

            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("Array is Sorted in Ascending Order");
        }
        else if (descending) {
            System.out.println("Array is Sorted in Descending Order");
        }
        else {
            System.out.println("Array is Not Sorted");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4};

        checkSorted(arr);
    }
}
