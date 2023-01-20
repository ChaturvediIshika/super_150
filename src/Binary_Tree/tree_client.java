package Binary_Tree;
/*
* 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false*/
public class tree_client {
    public static void main(String[] args) {
        tree bt=new tree();
//        bt.display();
//        bt.preorder();
        bt.inorder();
//        bt.postorder();
        System.out.println(bt.Search(8));
        System.out.println(bt.Maximum());
        System.out.println(bt.height());
        bt.level_order_traversal();
    }
}
