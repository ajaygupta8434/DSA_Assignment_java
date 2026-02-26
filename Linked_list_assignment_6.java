class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_list_assignment_6 {
    
    public static boolean hasCycle(Node head) {
        
        if (head == null) return false;
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps
            
            if (slow == fast) {
                return true;          // Cycle found
            }
        }
        
        return false;  // No cycle
    }
}