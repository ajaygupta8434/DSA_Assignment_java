
public class Linked_list_assignment_5 {
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
     public static Node merge(Node head1,Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;

        if(head1.data<head2.data){
            head1.next=merge(head1.next,head2);
            return head1;
        }else{
            head2.next=merge(head1,head2.next);
            return head2;
        }
     }
      public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    

 
    public static void main(String[] args) {
        Linked_list_assignment_5 list1=new Linked_list_assignment_5();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        Linked_list_assignment_5 list2=new Linked_list_assignment_5();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        Node mergedHead=Linked_list_assignment_5.merge(list1.head,list2.head);
        System.out.println("Merged Sorted Linked List:");
        while(mergedHead!=null){
            System.out.print(mergedHead.data+" ");
            mergedHead=mergedHead.next;
        }
    }
}
