package Assignment_Questions;

import java.util.*;

public class Sort_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        int q=sc.nextInt();
        while (q-->0){
            String str= sc.next();
            int a=sc.nextInt();
            map.put(str,a);
        }
        List<Map.Entry<String,Integer>> ls=new LinkedList<>(map.entrySet());
        Collections.sort(ls,(x,y)->(int)x.getValue()!=(int)y.getValue()?y.getValue()-x.getValue():x.getKey().compareTo(y.getKey()));
        for(Map.Entry<String,Integer> m:ls){
            if(m.getValue()>=n)
                System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
