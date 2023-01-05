package LinkedList;

public class List_Client {
    public static void main(String[] args) {
        listlinked node=new listlinked();
        node.addFirst(1);
        node.addFirst(2);
        node.addFirst(3);
        node.display();
        node.addLast(8);
        node.display();
        node.rever();
        node.display();
    }
}
