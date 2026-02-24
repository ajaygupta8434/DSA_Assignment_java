class RemoveDuplicatesFromSortedLinkedList {

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

    void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next node
            }
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    
} 
public class linked_list_assignment_4 {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLinkedList llist = new RemoveDuplicatesFromSortedLinkedList();
        llist.push(5);
        llist.push(4);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(2);
        llist.push(1);

        System.out.println("Original list:");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removing duplicates:");
        llist.printList();
    }
}
