package leetcode;

import java.util.Stack;

public class asteroid_collision {
    public static void main(String[] args) {
        int ast[]={10,-10};
        int q[]=collide(ast);
        for (int i:q)
            System.out.println(i);
    }
    public static int[] collide(int asteroids[]){
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            if (ast > 0) {
                stack.push(ast);
            }
            else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(ast)) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(ast);
                }

                if (stack.peek() == Math.abs(ast)) {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
