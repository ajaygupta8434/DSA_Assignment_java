class Stack_assignment_5 {

    int size;
    int top;
    int stack[];

    Stack_assignment_5(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    void push(int val) {
        stack[++top] = val;
    }

    int pop() {
        return stack[top--];
    }

    // Postfix Evaluation
    int evaluatePostfix(String exp) {

        top = -1;  // reset stack

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                push(ch - '0');
            } else {

                int val2 = pop();
                int val1 = pop();

                switch (ch) {
                    case '+': push(val1 + val2); break;
                    case '-': push(val1 - val2); break;
                    case '*': push(val1 * val2); break;
                    case '/': push(val1 / val2); break;
                }
            }
        }

        return pop();
    }

    // Prefix Evaluation
    int evaluatePrefix(String exp) {

        top = -1;  // reset stack

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                push(ch - '0');
            } else {

                int val1 = pop();
                int val2 = pop();

                switch (ch) {
                    case '+': push(val1 + val2); break;
                    case '-': push(val1 - val2); break;
                    case '*': push(val1 * val2); break;
                    case '/': push(val1 / val2); break;
                }
            }
        }

        return pop();
    }

    public static void main(String[] args) {

        Stack_assignment_5 p = new Stack_assignment_5(10);

        String postfix = "23*5+";
        String prefix = "+9*23";

        System.out.println("Postfix Result: " + p.evaluatePostfix(postfix));
        System.out.println("Prefix Result: " + p.evaluatePrefix(prefix));
    }
}