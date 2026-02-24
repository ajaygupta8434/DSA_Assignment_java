 class Linked_list_assignment_1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move pointers one position ahead
            current = next;
        }
        head = prev; // Update head to the new front of the list
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linked_list_assignment_1 list = new Linked_list_assignment_1();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(85);

        System.out.println("Given Linked List:");
        list.printList();

        list.reverse();

        System.out.println("\nReversed Linked List:");
        list.printList();
    }


}