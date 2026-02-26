public class Linked_list_assignment_7 {
     Node head;
      class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
     public void removeNthFromEnd(int n){
        Node dummy=new Node(0);
        dummy.next=head;
        Node first=dummy;
        Node second=dummy;

        for(int i=0;i<=n;i++){
            first=first.next;
        }

        while(first!=null){
            first=first.next;
            second=second.next;
        }

        second.next=second.next.next;
        head=dummy.next; // Update head in case the first node was removed
     }
      public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    

 
    public static void main(String[] args) {
        Linked_list_assignment_7 list=new Linked_list_assignment_7 ();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n=2; // Remove the 2nd node from the end
        list.removeNthFromEnd(n);

        System.out.println("Linked List after removing " + n + "th node from the end:");
        list.display();
    }   
    
}
