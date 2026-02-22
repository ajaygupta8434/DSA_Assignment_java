class InnerQueue {

    int size;
    int top1;
    int top2;
    int stack1[];
    int stack2[];

    InnerQueue(int size) {
        this.size = size;
        this.top1 = -1;
        this.top2 = -1;
        this.stack1 = new int[size];
        this.stack2 = new int[size];
    }

    // push in stack1
    public void push1(int val) {
        stack1[++top1] = val;
    }

    // push in stack2
    public void push2(int val) {
        stack2[++top2] = val;
    }

    // pop from stack1
    public int pop1() {
        return stack1[top1--];
    }

    // pop from stack2
    public int pop2() {
        return stack2[top2--];
    }

    // Enqueue operation
    public void enqueue(int val) {

        if (top1 == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        push1(val);
    }

    // Dequeue operation
    public int dequeue() {

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

    // Display Queue
    void display() {

        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty");
            return;
        }

        if (top2 != -1) {
            for (int i = top2; i >= 0; i--) {
                System.out.println(stack2[i]);
            }
        }

        for (int i = 0; i <= top1; i++) {
            System.out.println(stack1[i]);
        }
    }
}

public class Stack_assignment_3 {

    public static void main(String[] args) {

        InnerQueue q = new InnerQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue elements are:\n");
        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
        q.display();
    }
}