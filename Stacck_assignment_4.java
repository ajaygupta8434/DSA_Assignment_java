class Innerstack {

    int size;
    int top;
    int stack[];

    Innerstack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    // push
    public void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = val;
    }

    // pop
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // delete middle using traversal
    public void deleteMiddle() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        int middle = top / 2;

        // shift elements left
        for (int i = middle; i < top; i++) {
            stack[i] = stack[i + 1];
        }

        top--;   // reduce size
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class Stacck_assignment_4 {
    public static void main(String[] args) {

        Innerstack s = new Innerstack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);


        System.out.println("Before deleting middle:");
        s.display();

        s.deleteMiddle();

        System.out.println("After deleting middle:");
        s.display();
    }
}