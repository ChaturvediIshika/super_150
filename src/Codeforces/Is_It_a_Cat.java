package Codeforces;

import LinkedList.Linked_List_Cycle;

import java.util.*;

public class Is_It_a_Cat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            String str=sc.next();
            str=str.toLowerCase();
            int i=0;
            LinkedHashSet<Character> set=new LinkedHashSet<>();
            while (i<l && str.charAt(i)=='m'){
                i++;
            }
            if (i==0 ||i==l)
                System.out.println("NO");
            else {
                int j=i;
                while (i<l && str.charAt(i)=='e')
                    i++;
                if (i==j || j==l)
                    System.out.println("NO");
                else {
                    j=i;
                    while(i<l && str.charAt(i)=='o')
                        i++;
                    if(i==j || i==l)
                        System.out.println("NO");
                    else{
                        j=i;
                        while (i<l && str.charAt(i)=='w')
                            i++;
                        if (i==j || i!=l)
                            System.out.println("NO");
                        else
                            System.out.println("YES");
                    }
                }
            }
//            boolean flag=true;
//            if (set.size()!=4)
//                System.out.println("NO");
//            else{
//                List<Character> ls=new ArrayList<>(set);
//                if(ls.get(0)!='m') {
//                    System.out.println("NO");
//                    flag=false;
//                }
//                if(flag!=false && ls.get(1)!='e') {
//                    System.out.println("NO");
//                    flag=false;
//                }
//                if(flag!=false && ls.get(2)!='o') {
//                    System.out.println("NO");
//                    flag=false;
//                }
//                if(flag!=false && ls.get(3)!='w') {
//                    System.out.println("NO");
//                    flag=false;
//                }
//                if(flag==true)
//                    System.out.println("YES");
//            }
        }
    }
}
