package recursion;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        int n=100;
        lexico(n,ls,0);
        System.out.println(ls);
    }
    public static void lexico(int n,List<Integer> ls,int curr)
    {
        if(curr>n)
        {
            return;
        }
        ls.add(curr);
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            lexico(n,ls,curr*10+i);
        }
    }
}
