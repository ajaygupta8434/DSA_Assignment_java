public class Stack_assignment_6 {

    static int top = -1;
    static char stack[] = new char[100];

    // Push
    static void push(char c) {
        stack[++top] = c;
    }

    // Pop
    static char pop() {
        return stack[top--];
    }

    // Peek
    static char peek() {
        return stack[top];
    }

    // Check empty
    static boolean isEmpty() {
        return top == -1;
    }

    // Precedence
    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;
        return -1;
    }

    // Check operand
    static boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    // Infix to Postfix
    static String infixToPostfix(String exp) {
        String result = "";
        top = -1; // reset stack
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (isOperand(ch)) {
                result += ch;
            }
            else if (ch == '(') {
                push(ch);
            }
            else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    result += pop();
                }
                pop(); // remove '('
            }
            else { // operator
                while (!isEmpty() && precedence(ch) <= precedence(peek())) {

                    if (ch == '^' && peek() == '^')
                        break;

                    result += pop();
                }
                push(ch);
            }
        }

        while (!isEmpty()) {
            result += pop();
        }

        return result;
    }

    // Infix to Prefix
    static String infixToPrefix(String exp) {

        // Step 1: Reverse string
        String reversed = "";
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '(')
                reversed += ')';
            else if (ch == ')')
                reversed += '(';
            else
                reversed += ch;
        }

        // Step 2: Postfix
        String postfix = infixToPostfix(reversed);

        // Step 3: Reverse result
        String prefix = "";
        for (int i = postfix.length() - 1; i >= 0; i--) {
            prefix += postfix.charAt(i);
        }

        return prefix;
    }

    public static void main(String[] args) {

        String exp = "A+B*(C-D)";

        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + infixToPostfix(exp));
        System.out.println("Prefix: " + infixToPrefix(exp));
    }
}