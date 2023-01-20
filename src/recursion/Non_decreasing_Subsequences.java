package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Non_decreasing_Subsequences {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String str="";
        for (int q:a)
            str+=q;
        HashSet<List<Integer>> lls=new HashSet<>();
        subseq(str,0,"",lls);
        System.out.println(lls);
        List<List<Integer>> hs=new ArrayList<>();
        for (List<Integer> l:lls)
            hs.add(l);
        System.out.println(hs);
    }
    public static void subseq(String ques, int idx,String ans,HashSet<List<Integer>>lls){
        if(ques.length()==0){
            if(ans.length()>=2) {
                List<Integer> ls = new ArrayList<>();
                for (int i = 0; i < ans.length() - 1; i++) {
                    if ((ans.charAt(i) - 48) > (ans.charAt(i + 1) - 48))
                        return;
                    else
                        ls.add(ans.charAt(i) - 48);
                }
                ls.add(ans.charAt(ans.length()-1)-48);
                lls.add(ls);
            }
            return;
        }
        char ch=ques.charAt(0);
        subseq(ques.substring(1),idx,ans+ch,lls);
        subseq(ques.substring(1),idx,ans,lls);
    }
}
