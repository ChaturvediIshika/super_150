package leetcode;

import java.util.Scanner;

public class gas_fuel_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gas[]=new int[n];
        for(int i=0;i<n;i++)
            gas[i] = sc.nextInt();
        int m=sc.nextInt();
        int cost[]=new int[m];
        for(int i=0;i<m;i++)
            cost[i] = sc.nextInt();
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int pos=-1;
        int current=0;
        int total=0;
        int diff=0;
        for(int i=0;i<gas.length;i++)
        {
            diff=gas[i]-cost[i];
            current+= diff;
            total+=diff;
            if(current<0){
                current=0;
                pos=i;
            }
        }
        if(total>=0){
            return pos+1;
        }
        return -1 ;


    }
}
