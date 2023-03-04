package Priority_Queue;

public class Generie_Heap_Client {
    public static void main(String[] args) {
        Generic_heap<Cars> gh=new Generic_heap<>();
        gh.add(new Cars(200,10,"white"));
        gh.add(new Cars(100,25,"black"));
        gh.add(new Cars(500,50,"pink"));
        gh.add(new Cars(250,19,"red"));
        gh.add(new Cars(300,40,"blue"));
        gh.display();
        System.out.println(gh.delete());
        gh.display();
    }
}
