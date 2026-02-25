public class Linked_list_assignment_10 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    // Function to get length of linked list
    static int getLength(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // Function to find intersection point
    static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        // Calculate difference
        int diff = Math.abs(lenA - lenB);

        // Advance the longer list
        Node longer = lenA > lenB ? headA : headB;
        Node shorter = lenA > lenB ? headB : headA;

        for (int i = 0; i < diff; i++) {
            longer = longer.next;
        }

        // Traverse both together
        while (longer != null && shorter != null) {
            if (longer == shorter) { // Compare references
                return longer;
            }
            longer = longer.next;
            shorter = shorter.next;
        }

        return null; // No intersection
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
        // Create two linked lists with intersection
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(5);

        Node headB = new Node(2);
        headB.next = new Node(4);

        // Common tail
        Node common = new Node(7);
        common.next = new Node(9);

        // Attach common tail
        headA.next.next.next = common;
        headB.next.next = common;

        // Print lists
        print(headA); // 1 3 5 7 9
        print(headB); // 2 4 7 9

        Node intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}