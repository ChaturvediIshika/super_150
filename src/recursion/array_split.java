package recursion;

import javax.swing.*;
import java.util.Stack;

public class array_split {
    static int c=0;
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5};
        int total=18;
        split(a,"",0,0,"",0);
        System.out.println(c);
    }
    public static void split(int a[],String s,int sum,int idx,String s1,int sum1)
    {
        if(idx==a.length) {
            if (sum1 == sum && sum!=0) {

                System.out.println(s + " and" + s1);
                c++;
            }
            return;
        }
        split(a,s+" "+a[idx],sum+a[idx],idx+1,s1,sum1);
        split(a,s,sum,idx+1,s1+" "+a[idx],sum1+a[idx]);
    }
}
