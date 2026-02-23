public class Array_assignment_13 {

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 2, 2, 3, 3};

        for (int i = 0; i < arr.length; i++) {

            // Check if already appeared before
            boolean alreadyChecked = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked)
                continue;

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " repeated " + count + " times");
            }
        }
    }
}