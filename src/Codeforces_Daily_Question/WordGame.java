package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            HashMap<String,Integer> map=new HashMap<>();
            HashSet<String> a=new HashSet<>();
            HashSet<String> b=new HashSet<>();
            HashSet<String> c=new HashSet<>();
            int ac=0,bc=0,cc=0;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String s=sc.next();
                map.put(s,map.getOrDefault(s,0)+1);
                a.add(s);
            }
            for(int i=0;i<n;i++){
                String s=sc.next();
                map.put(s,map.getOrDefault(s,0)+1);
                b.add(s);
            }
            for(int i=0;i<n;i++){
                String s=sc.next();
                map.put(s,map.getOrDefault(s,0)+1);
                c.add(s);
            }
            for(String sk:map.keySet()){
                if(map.get(sk)==1){
                    if(a.contains(sk))
                        ac+=3;
                    if(b.contains(sk))
                        bc+=3;
                    if(c.contains(sk))
                        cc+=3;
                }
                else if(map.get(sk)==2){
                    if(a.contains(sk))
                        ac++;
                    if(b.contains(sk))
                        bc++;
                    if(c.contains(sk))
                        cc++;
                }
            }
            System.out.println(ac+" "+bc+" "+cc);
        }
    }
}
