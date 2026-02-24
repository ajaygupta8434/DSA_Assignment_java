class Queue_assignment_6 {

    static void findFirstNegative(int arr[], int n, int k) {

        int queue[] = new int[n];  // store indexes of negative numbers
        int front = 0, rear = -1;

        for (int i = 0; i < n; i++) {

            // Step 1: Remove elements out of window
            if (front <= rear && queue[front] <= i - k) {
                front++;
            }

            // Step 2: Add current element if negative
            if (arr[i] < 0) {
                queue[++rear] = i;
            }

            // Step 3: Print result when first window is complete
            if (i >= k - 1) {

                if (front <= rear)
                    System.out.print(arr[queue[front]] + " ");
                else
                    System.out.print("0 ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        findFirstNegative(arr, arr.length, k);
    }
}