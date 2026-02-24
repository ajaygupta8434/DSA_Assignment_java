class ReverseQueue {

    int size;
    int front, rear;
    int queue[];
    int top;
    int stack[];

    ReverseQueue(int size) {
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

    // Reverse Queue
    void reverse() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        // Step 1: Move queue to stack
        while (front <= rear) {
            stack[++top] = dequeue();
        }

        // Reset queue
        front = 0;
        rear = -1;

        // Step 2: Move stack back to queue
        while (top != -1) {
            enqueue(stack[top--]);
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
public class Queue_assignment_2 {
 public static void main(String[] args) {

        ReverseQueue q = new ReverseQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Original Queue:");
        q.display();

        q.reverse();

        System.out.println("Reversed Queue:");
        q.display();
    }   
}
