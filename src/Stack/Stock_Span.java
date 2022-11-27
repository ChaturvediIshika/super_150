package Stack;

import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int a[]={10,2,1,3,3,4,7,8,19};
        span(a);
    }
    public static void span(int a[])
    {
        int ans[]=new int[a.length];
        Stack<Integer> st=new Stack();
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty() && a[i]>=a[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i]=i-st.peek();
            }
            else {
                ans[i]=i+1;
            }
            st.push(i);
        }
        for (int i=0;i<a.length;i++)
            System.out.print(ans[i]+" ");
    }
}
