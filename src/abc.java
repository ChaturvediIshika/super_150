import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        print(a);
        for (int i:a)
            System.out.println(i);
    }
    public static void print(int a[]){
        a[2]=7;
        for (int i:a)
            System.out.println(i);
    }

}
