package Stack;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 4, 6, 1, 7};
        System.out.println(area(a));
    }

    public static int area(int a[])
    {
        Stack<Integer> st=new Stack<>();
        int maxarea=0;
        for (int i=0;i<a.length;i++)
        {
            while (!st.isEmpty() && a[i]<a[st.peek()])
            {
                int h=a[st.pop()];
                int r=i;
                if(st.isEmpty())
                {
                    maxarea=Math.max(maxarea,h*r);
                }
                else {
                    int l=st.peek();
                    maxarea=Math.max(maxarea,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=a.length;
        while (!st.isEmpty())
        {
            int h=a[st.pop()];
            if(st.isEmpty())
            {
                maxarea=Math.max(maxarea,h*r);
            }
            else {
                int l=st.peek();
                maxarea=Math.max(maxarea,h*(r-l-1));
            }
        }
        return maxarea;
    }
}
