package Codeforces_Daily_Question;

import java.util.*;

public class Reachability_from_the_Capital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int s= sc.nextInt();
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++)
            map.put(i,new ArrayList<>());
        for(int i=0;i<m;i++){
            int a1=sc.nextInt();
            int a2= sc.nextInt();
            map.get(a2).add(a1);
        }
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
//        for (int i=1;i<=n;i++){
//            if(visited.contains(i))
//                continue;
//            else{
                q.add(s);
                while (!q.isEmpty()){
                    int rv=q.poll();
                    if(visited.contains(rv))
                        continue;
                    visited.add(rv);
                    for (int k:map.get(rv)){
                        if(!visited.contains(k))
                            q.add(k);
                    }
                }
//            }
//        }
        System.out.println(n-visited.size());
    }
}
