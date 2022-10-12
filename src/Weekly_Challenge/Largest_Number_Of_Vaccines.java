package Weekly_Challenge;

import java.util.*;

public class Largest_Number_Of_Vaccines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int query[]=new int[n];
        int cost[]=new int[9];
        for (int i=0;i<9;i++)
            cost[i] = sc.nextInt();
        for (int i=0;i<n;i++)
            query[i] = sc.nextInt();
        function_cost(n,cost,query);
    }
    public static void function_cost(int n,int cost[],int query[])
    {
        Arrays.sort(cost);
        int min1=cost[0],min2=cost[0];
        for(int i=0;i<n;i++)
        {
            if(cost[i]!=min1)
            {
                min2=cost[i];
                break;
            }
        }
        for (int j=0;j<n;j++) {
            if (min1 == min2) {
                System.out.print(query[j] / min1 + " ");
            }
            else {
                int c = 0;
                int k = query[j];
                int i = 0;
                while (true) {
                    if (k >= min1) {
                        k -= min1;
                        c++;
                    } else if (k < min1) {
                        break;
                    }
                    if (k >= min2) {
                        k -= min2;
                        c++;
                    } else {
                        break;
                    }
                }
                System.out.print(c + " ");
            }
        }
    }
}
