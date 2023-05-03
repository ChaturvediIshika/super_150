package leetcode;

import java.util.Scanner;

import static java.lang.System.*;

public class Can_Jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(canJump(a));
    }
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int max=0;
        for(int index=0;index<n-1&& max>=index;index++)
        {
            if(max<index+nums[index])
            {
                max=index+nums[index];
            }
            if(max>=n-1){
                return true;
            }
        }
        return false;

    }
}
