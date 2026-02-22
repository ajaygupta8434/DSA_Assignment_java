// •	Stack and Its Operations

public class Stack_asigment_1 {  
    public static void main(String[] args) {

        String str = "()";

        char[] stack = new char[str.length()];
        int top = -1;   // stack empty

        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening bracket → Push
            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            }

            // Closing bracket → Pop and check
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (top == -1) {   // stack empty
                    balanced = false;
                    break;
                }

                char last = stack[top];
                top--;

                if (ch == ')' && last != '(') balanced = false;
                if (ch == '}' && last != '{') balanced = false;
                if (ch == ']' && last != '[') balanced = false;
            }
        }

        if (top != -1) {
            balanced = false;
        }

        if (balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}