public class Linked_list_assignment_7 {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) { sum += l1.data; l1 = l1.next; }
            if (l2 != null) { sum += l2.data; l2 = l2.next; }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);

        Node l2 = new Node(5);
        l2.next = new Node(6);

        Node result = add(l1, l2);
        print(result);
    }
}