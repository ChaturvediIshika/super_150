package LinkedList;

import java.util.Stack;

public class listlinked {
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
    private Node getNode(int k)throws Exception{
        if(k<0 ||k>=size)
            throw new Exception("out of range");
        Node temp=head;
        for (int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addAtIndex(int i,int k)throws Exception{
        if(k<0 ||k>size)
            throw new Exception("out of range");
        if(k==0)
            addFirst(i);
        else if (k==size)
            addLast(i);
        else{
            Node n=getNode(k-1);
            Node nn=new Node();
            nn.val=i;
            n.next=nn;
        }
    }
    public void rever(){
        h=head;
        c=0;
        reverse(h,c);
    }
    Node h;
    int c=0;
    public void reverse(Node temp,int i){
        if (temp==null)
            return;
        reverse(temp.next,i+1);
        if (i>c){
            int v=temp.val;
            temp.val=h.val;
            h.val=v;
            h=h.next;
            c++;
        }
    }

    public Node reverseKGroup(Node head, int k) {
        Stack<Node> st=new Stack<>();
        Node dummy=new Node();
        Node temp=dummy;
        Node start=null;
        while(head!=null){
            if (st.size()==0)
                start=head;
            st.push(head);
            if(st.size()==k){
                while (!st.isEmpty()){
                    Node nn=new Node();
                    nn.val=st.pop().val;
                    dummy.next=nn;
                    dummy=dummy.next;
                }
            }
            head=head.next;
        }
        if(st.size()>0)
            dummy.next=start;
        return temp.next;
    }
}
