package leetcode;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String str[]={"2","1","+","3","*"};//((2+1)*3)
        System.out.println(calcu(str));
    }
    public static int calcu(String str[]){
        Stack<Integer> st1=new Stack<>();
        for(int i= 0;i< str.length;i++) {
            if (!str[i].equals("+") && !str[i].equals("-") && !str[i].equals("*") && !str[i].equals("/")) {
                st1.push(Integer.valueOf(str[i]));
            }
            else if (str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")) {
                int q = st1.pop();
                int sum = st1.pop();
                if (str[i].equals("+"))
                    sum += q;
                if (str[i].equals("-"))
                    sum -= q;
                if (str[i].equals("*"))
                    sum *= q;
                if (str[i].equals("/"))
                    sum /= q;
                st1.push(sum);
            }
        }
        return st1.pop();
    }
}
