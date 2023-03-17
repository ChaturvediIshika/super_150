package Graph;

import java.util.HashSet;

public class graph_Store_Client {
    public static void main(String[] args) {
        Graph_store gs=new Graph_store(7);
        gs.AddEdge(1,4,6);
        gs.AddEdge(1,2,10);
        gs.AddEdge(2,3,7);
        gs.AddEdge(3,4,5);
        gs.AddEdge(4,5,1);
        gs.AddEdge(5,6,4);
        gs.AddEdge(7,5,3);
        gs.AddEdge(6,7,3);
//        System.out.println(gs.ContainsEdge(3,4));
//        System.out.println(gs.ContainsVertex(2));
//        System.out.println(gs.numOfEdge());
//        gs.display();
//        gs.removeEdge(1,4);
//        gs.vertexRemove(4);
//        System.out.println();
//        gs.display();
//        System.out.println(gs.hasPath(1,6, new HashSet<Integer>()));
//        gs.allPath(1,6,new HashSet<>(),"");
//        System.out.println(gs.BFS(1,6));
//        System.out.println(gs.DFS(1,6));
        gs.BFT();
        gs.DFT();
    }
}
