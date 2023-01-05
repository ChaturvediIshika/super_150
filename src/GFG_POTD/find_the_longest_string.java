package GFG_POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class find_the_longest_string {
    public static void main(String[] args) {
        String[] str={"ab", "a", "aa", "abd" ,"abc","abda", "abdd","abde","abdab"};
        System.out.println(longest(str));
    }
    public static String longest(String[] arr){
        Arrays.sort(arr);
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==1)
                hs.add(arr[i]);
            else if(hs.contains(arr[i].substring(0,arr[i].length()-1))==true)
                hs.add(arr[i]);
        }
        ArrayList<String> ls=new ArrayList<>(hs);
        Collections.sort(ls,(a,b)-> (a.length() != b.length()) ? (b.length() - a.length()) : a.compareTo(b));
        if (ls.size()==0)
            return "";
        return ls.get(0);
    }
}
