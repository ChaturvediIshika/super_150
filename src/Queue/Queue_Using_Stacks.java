package Queue;

import java.util.Scanner;
import java.util.Stack;

public class Queue_Using_Stacks {
    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            enque(i);
        for(int i=0;i<n;i++)
            System.out.print(deque()+" ");
    }
    public static void enque(int item)
    {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(item);
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    public static int deque(){
        if (st1.isEmpty()){
            System.out.println("Stack is Empty.");
            System.exit(0);
        }
        return st1.pop();
    }
}
