package LinkedList;

public class List_Client {
    public static void main(String[] args) {
        listlinked node=new listlinked();
        node.addFirst(1);
        node.addFirst(2);
        node.addLast(4);
        node.addLast(5);
        node.addFirst(-1);
        node.addLast(6);
//        try {
//            System.out.println(node.getFirst());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            System.out.println(node.getLast());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(node.getDataAtIndex(0));
        node.display();
//        try {
//            node.addAtIndex(10,4);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            node.addAtIndex(50,2);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            node.removeFirst();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            node.removeLast();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            node.removeLast();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            System.out.println(node.getLast());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
            node.removeAtIndex(3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        node.display();
    }
}
