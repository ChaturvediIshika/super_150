package Codeforces_Daily_Question;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=n-1;i>=0;i--){
            if(!hs.contains(a[i])){
                st.push(a[i]);
                hs.add(a[i]);
            }
        }
        System.out.println(st.size());
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
