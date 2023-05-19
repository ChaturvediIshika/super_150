package Assignment_4440;

import java.util.*;

public class DNA_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> ls=new ArrayList<>();
        for(int i=0;i<str.length()-9;i++){
            String s=str.substring(i,i+10);
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
            if(map.get(s)==2)
                ls.add(s);
        }
        for(String sq:ls)
            System.out.print(sq+" ");
    }
}
