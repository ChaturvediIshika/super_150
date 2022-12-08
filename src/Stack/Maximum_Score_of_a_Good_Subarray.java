package Stack;

import java.util.Stack;

public class Maximum_Score_of_a_Good_Subarray {
    public static void main(String[] args) {
        int a[]={1,4,3,7,4,5};
        int k=3;
        System.out.println(area(a,k));
    }
    public static int area(int a[],int k)
    {
        Stack<Integer> st=new Stack<>();
        int maxarea=0;
        for (int i=0;i<a.length;i++)
        {
            while (!st.isEmpty() && a[i]<a[st.peek()])
            {
                int h=a[st.pop()];
                int r=i;
                if(r-1>=k) {
                    if (st.isEmpty()) {
                        maxarea = Math.max(maxarea, h * r);
                    } else {

                        int l = st.peek();
                        if (l+1<=k)
                            maxarea = Math.max(maxarea, h * (r - l - 1));
                    }
                }
            }
            st.push(i);
        }
        int r=a.length;
        while (!st.isEmpty())
        {
            int h=a[st.pop()];
            if(r-1>=k) {
                if (st.isEmpty()) {
                    maxarea = Math.max(maxarea, h * r);
                } else {

                    int l = st.peek();
                    if (l+1<=k)
                        maxarea = Math.max(maxarea, h * (r - l - 1));
                }
            }
        }
        return maxarea;
    }
}
