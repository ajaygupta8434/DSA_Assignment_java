class Queue_assignment_5 {

    static void findMax(int arr[], int n, int k) {

        int queue[] = new int[n]; // store indexes
        int front = 0, rear = -1;

        for (int i = 0; i < n; i++) {

            // Step 1: Remove indexes out of this window
            if (front <= rear && queue[front] <= i - k) {
                front++;
            }

            // Step 2: Remove smaller elements from rear
            while (front <= rear && arr[queue[rear]] <= arr[i]) {
                rear--;
            }

            // Step 3: Insert current index
            queue[++rear] = i;

            // Step 4: Print maximum when window is complete
            if (i >= k - 1) {
                System.out.print(arr[queue[front]] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        findMax(arr, arr.length, k);
    }
}
