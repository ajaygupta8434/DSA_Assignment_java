public class Linked_list_assignment_12 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    // Partition list
    static Node partition(Node head, int x) {
        Node beforeHead = new Node(0);
        Node afterHead = new Node(0);
        Node before = beforeHead;
        Node after = afterHead;

        Node current = head;
        while (current != null) {
            if (current.data < x) {
                before.next = current;
                before = before.next;
            } else {
                after.next = current;
                after = after.next;
            }
            current = current.next;
        }

        // Connect the two lists
        after.next = null; // Important to avoid cycle
        before.next = afterHead.next;

        return beforeHead.next;
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
        // Example: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        System.out.println("Original list:");
        print(head);

        head = partition(head, 3);
        System.out.println("After partition around 3:");
        print(head); // Output: 1 2 2 4 3 5
    }
}