public class Stack_assignment_2 {
    public static void main(String[] args) {

        String str = "Ajay";

        char[] stack = new char[str.length()];
        int top = -1;

        // Step 1: Push all characters
        for (int i = 0; i < str.length(); i++) {
            top++;
            stack[top] = str.charAt(i);
        }

        // Step 2: Pop and print (Reverse)
        System.out.print("Reversed String: ");

        while (top != -1) {
            System.out.print(stack[top]);
            top--;
        }
    }
    
}
