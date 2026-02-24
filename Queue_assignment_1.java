class QueueUsingStacks {

    int size;
    int top1, top2;
    int stack1[], stack2[];

    QueueUsingStacks(int size) {
        this.size = size;
        top1 = -1;
        top2 = -1;
        stack1 = new int[size];
        stack2 = new int[size];
    }

    // Push in stack1
    void push1(int val) {
        stack1[++top1] = val;
    }

    // Push in stack2
    void push2(int val) {
        stack2[++top2] = val;
    }

    // Pop from stack1
    int pop1() {
        return stack1[top1--];
    }

    // Pop from stack2
    int pop2() {
        return stack2[top2--];
    }

    // Enqueue
    void enqueue(int val) {
        if (top1 == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        push1(val);
    }

    // Dequeue
    int dequeue() {

        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        if (top2 == -1) {
            while (top1 != -1) {
                push2(pop1());
            }
        }

        return pop2();
    }

    // Display
    void display() {

        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements:");

        for (int i = top2; i >= 0; i--) {
            System.out.println(stack2[i]);
        }

        for (int i = 0; i <= top1; i++) {
            System.out.println(stack1[i]);
        }
    }
}

public class Queue_assignment_1 {
     public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.display();
    }
    
}
