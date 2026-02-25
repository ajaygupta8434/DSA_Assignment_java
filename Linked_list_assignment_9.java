public class Linked_list_assignment_9 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    // Reverse a linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Check if palindrome
    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean palindrome = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Step 4 (Optional): Restore original list
        slow.next = reverse(secondHalf);

        return palindrome;
    }

    // Print linked list
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        print(head);
        System.out.println("Is Palindrome? " + isPalindrome(head)); // true

        // Another Example: 1 -> 2 -> 3
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(1);

        print(head2);
        System.out.println("Is Palindrome? " + isPalindrome(head2)); // false
    }
}