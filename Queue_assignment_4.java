class CircularQueue {

    int size;
    int front, rear;
    int queue[];

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if queue is full
    boolean isFull() {
        return (front == (rear + 1) % size);
    }

    // Check if queue is empty
    boolean isEmpty() {
        return (front == -1);
    }

    // Enqueue
    void enqueue(int val) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = val;
    }

    // Dequeue
    int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    // Display
    void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }

        System.out.println();
    }
}
public class Queue_assignment_4 {
  public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.display();

        q.enqueue(50);
        q.enqueue(60);

        q.display();
    }   
}
