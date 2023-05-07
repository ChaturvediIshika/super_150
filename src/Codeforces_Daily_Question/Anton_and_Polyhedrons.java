package Codeforces_Daily_Question;

import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long c=0;
        while (n-->0){
            String str=sc.next();
            if(str.equals("Tetrahedron"))
                c+=4;
            if(str.equals("Cube"))
                c+=6;
            if(str.equals("Octahedron"))
                c+=8;
            if(str.equals("Dodecahedron"))
                c+=12;
            if(str.equals("Icosahedron"))
                c+=20;
        }
        System.out.println(c);
    }
}
