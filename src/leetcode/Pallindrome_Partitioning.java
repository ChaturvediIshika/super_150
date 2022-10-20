package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Pallindrome_Partitioning {
    public static void main(String[] args) {
        String str="nitin";
        List<List<String>> lls=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        partitioning(str,"",ls,lls);
        System.out.println(lls);
    }
    public static void partitioning(String ques,String ans,List<String> ls, List<List<String>> lls)
    {
        if(ques.length()==0)
        {
            lls.add(new ArrayList<>(ls));
            System.out.println(ans);
            return;
        }
        for (int cut=1;cut<=ques.length();cut++)
        {
            String s1=ques.substring(0,cut);
            if(palindrome(s1)) {
                ls.add(s1);
                partitioning(ques.substring(cut), ans + s1 + '|',ls,lls);
                ls.remove(ls.size()-1);
            }
        }
    }
    public static boolean palindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
