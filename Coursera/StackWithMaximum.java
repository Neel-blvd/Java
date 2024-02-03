package Coursera;

import java.util.Scanner;
import java.util.Stack;

class StackWithMaximum
{
    static void push(Stack<Integer> s1,Stack<Integer> s2,int item)
    {
        s1.push(item);

        if(s2.isEmpty() || item>s2.peek())
            s2.push(item);
        else
            s2.push(s2.peek());
    }
    static void pop(Stack<Integer> s1,Stack<Integer> s2)
    {
        s1.pop();
        s2.pop();
    }
    static int max(Stack<Integer> s2)
    {
        return s2.peek();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        int n=sc.nextInt();sc.close();
        String[] query=new String[n];

        int i;

        sc.nextLine();
        for(i=0;i<=n-1;i++)
        {
            query[i]=sc.nextLine();
        }

        for(i=0;i<=n-1;i++)
        {
            if(query[i].startsWith("push"))
                push(s1,s2,Integer.parseInt(query[i].substring(5)));
            else if(query[i].equals("pop"))
                pop(s1,s2);
            else if(query[i].equals("max"))
                System.out.println(max(s2));
        }
    }
}
