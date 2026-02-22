public class Array_assignment_9 {
    

    public static int[] mergeArrays(int arr1[], int arr2[]) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int merged[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Dono arrays compare karo
        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Agar arr1 me elements bach gaye
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Agar arr2 me elements bach gaye
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 4, 6};

        int result[] = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
