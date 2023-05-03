package Extra;

import java.util.*;
import java.math.*;
public class PlusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int q[]=plusOne(a);
        for(int r:q)
        {
            System.out.println(r);
        }
    }

    public static int[] plusOne(int[] digits) {
        int num=0,q;
        for(int i=0;i<digits.length;i++)
        {
            num=num*10+digits[i];
        }
        System.out.println(num);
        num+=1;
        int d;
        if((num/Math.pow(10,digits.length))==1)
        {
            d=digits.length+1;
        }
        else
        {
            d=digits.length;
        }
        int arr[]=new int[d];
        for(int i=arr.length-1;i>=0;i--)
        {
            q=num%10;
            arr[i]=q;
            num=num/10;
        }
        return arr;
    }
}
