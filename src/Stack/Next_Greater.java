package Stack;

public class Next_Greater {
    public static void main(String[] args)throws Exception {
        int a[]={10,2,1,3,5,4,8,7};
        Dynamic_Stack st=new Dynamic_Stack();
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty() && a[i]>a[st.peek()])
            {
                a[st.peek()]=a[i];
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty())
        {
            int q=st.pop();
            a[q]=-1;
        }
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
