class Queue_assignment_7 {

    static void generate(int n) {

        String queue[] = new String[2 * n]; // enough space
        int front = 0, rear = 0;

        // Step 1: Insert "1"
        queue[rear++] = "1";

        for (int i = 1; i <= n; i++) {

            // Get front element
            String current = queue[front++];

            // Print it
            System.out.println(current);

            // Add next two binary numbers
            queue[rear++] = current + "0";
            queue[rear++] = current + "1";
        }
    }

    public static void main(String[] args) {

        int n = 10;
        generate(n);
    }
}