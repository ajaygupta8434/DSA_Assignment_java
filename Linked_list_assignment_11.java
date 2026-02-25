public class Linked_list_assignment_11 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    // Swap nodes in pairs
    static Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // Swap
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Move prev two nodes ahead
            prev = first;
        }

        return dummy.next;
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
        // Example: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original list:");
        print(head);

        head = swapPairs(head);
        System.out.println("After swapping pairs:");
        print(head); // Output: 2 1 4 3
    }
}