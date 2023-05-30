package Assignment_4440;

import java.util.*;

public class Doctors_The_Saviours {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++)
            map.put(i,new HashMap<>());
        for(int i=1;i<=n;i++){
            int m=sc.nextInt();
            int c= sc.nextInt();
            map.get(i).put(m,c);
        }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> ls=new ArrayList<>();
        int d=0;
        for(int i=1;i<=n;i++){
            if(hs.contains(i))
                continue;
            d++;
            q.add(i);
            int c=0;
            while (!q.isEmpty()){
                int rv=q.poll();
                hs.add(rv);
                for (int nbrs:map.get(rv).keySet()){
                    if(!hs.contains(nbrs)) {
                        q.add(nbrs);
                        c += map.get(rv).get(nbrs);
                    }
                }
            }
            ls.add(c);
        }
        Collections.sort(ls);
        System.out.println("#doctors needed: "+d);
        for (int i=0;i<ls.size();i++)
            System.out.println("#Q"+(i+1)+": "+ls.get(i)+" minutes");
    }
}
