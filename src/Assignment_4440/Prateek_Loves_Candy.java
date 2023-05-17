package Assignment_4440;

import LinkedList.Linked_List_Cycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prateek_Loves_Candy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> ls=prime();
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(ls.get(n-1));
        }
    }
    public static List<Integer> prime(){
        int a[]=new int[1000001];
        for(int i=2;i<a.length;i++){
            if(a[i]!=1){
                for(int j=2;j*i<a.length;j++)
                    a[i*j]=1;
            }
        }
        List<Integer> ls=new ArrayList<>();
        for (int i=2;i<a.length;i++){
            if(a[i]==0)
                ls.add(i);
        }
        return ls;
    }
}
