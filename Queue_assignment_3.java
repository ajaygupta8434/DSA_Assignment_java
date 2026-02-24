class ReverseFirstK {

    int size;
    int front, rear;
    int queue[];
    int stack[];
    int top;

    ReverseFirstK(int size) {
        this.size = size;
        queue = new int[size];
        stack = new int[size];
        front = -1;
        rear = -1;
        top = -1;
    }

    // Enqueue
    void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        queue[++rear] = val;
    }

    // Dequeue
    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front++];
    }

    // Reverse First K elements
    void reverseFirstK(int k) {

        if (k > (rear - front + 1) || k <= 0) {
            System.out.println("Invalid K value");
            return;
        }

        // Step 1: Push first K elements to stack
        for (int i = 0; i < k; i++) {
            stack[++top] = dequeue();
        }

        // Step 2: Add stack elements back to queue
        while (top != -1) {
            enqueue(stack[top--]);
        }

        // Step 3: Move remaining elements to rear
        int remaining = (rear - front + 1) - k;

        for (int i = 0; i < remaining; i++) {
            enqueue(dequeue());
        }
    }

    // Display
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
public class Queue_assignment_3 {
  public static void main(String[] args) {

        ReverseFirstK q = new ReverseFirstK(10);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Original Queue:");
        q.display();

        q.reverseFirstK(4);

        System.out.println("After Reversing First 3 Elements:");
        q.display();
    }   
}
