package LinkedList;

public class Linked_List_Cycle {
    private class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int i){
        Node nn=new Node();
        nn.val=i;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else {
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.next;
        }
        System.out.println(".");
    }
    public void addLast(int i){
        if(size==0)
            addFirst(i);
        else{
            Node nn=new Node();
            nn.val=i;
            tail.next=nn;
            size++;}
    }
    public void createCycle(){
        tail.next=head;
    }
    public Node detect(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return fast;
            }
        }
        return null;
    }
    public void removeCycle(){
        Node m=detect();
        if(m==null)
            return;
        Node slow=head;
        while(slow.next!=m.next){
            slow=slow.next;
            m=m.next;
        }
        m.next=null;
    }

    public static void main(String[] args) {
        Linked_List_Cycle cll=new Linked_List_Cycle();
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(3);
        cll.addLast(4);
        cll.addLast(5);
        cll.addLast(6);
        cll.createCycle();
        cll.removeCycle();
    }
}
