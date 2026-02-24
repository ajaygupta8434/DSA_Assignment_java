public class linked_list_assignment_3 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printNthFromLast(int n) {
        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (n > length) {
            System.out.println("N is greater than the number of nodes in the list.");
            return;
        }

        temp = head;
        for (int i = 1; i < length - n + 1; i++) {
            temp = temp.next;
        }
        System.out.println("The " + n + "th node from the end is: " + temp.data);
    }

    public static void main(String[] args) {
        linked_list_assignment_3 llist = new linked_list_assignment_3();
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.printNthFromLast(5);
    }
}