package Assignment_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class String_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<String> ls=new ArrayList<>();
        while (n-->0)
            ls.add(sc.next());
        Collections.sort(ls,(a,b)-> !a.contains(b) ? a.compareTo(b):b.length()-a.length());
        for(String l:ls)
            System.out.println(l);
    }
}
