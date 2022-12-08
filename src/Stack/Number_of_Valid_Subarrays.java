package Stack;

import java.util.Stack;

public class Number_of_Valid_Subarrays {
    public static void main(String[] args) {
        int a[]={1,4,2,5,3};
        System.out.println(count(a));
    }
    public static int count(int a[])
    {
        int s=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty() && a[i]<a[st.peek()])
            {
                st.pop();
            }
            st.push(i);
            s+=st.size();
        }
        return s;
    }
}
