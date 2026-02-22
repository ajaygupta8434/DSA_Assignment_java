public class Stack_assignment_7 {

    static int stack[] = new int[100];
    static int top = -1;

    static void push(int x) {
        stack[++top] = x;
    }

    static int pop() {
        return stack[top--];
    }

    static int peek() {
        return stack[top];
    }

    static boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 2, 10, 8};
        int n = arr.length;
        int result[] = new int[n];

        top = -1;

        for (int i = n - 1; i >= 0; i--) {

            while (!isEmpty() && peek() <= arr[i]) {
                pop();
            }

            if (isEmpty())
                result[i] = -1;
            else
                result[i] = peek();

            push(arr[i]);
        }

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}