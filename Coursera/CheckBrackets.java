package Coursera;

import java.util.Scanner;
import java.util.Stack;

class CheckBrackets {

    static boolean isOpeningBracket(char ch)
    {
        return ch == '(' || ch == '{' || ch == '[';
    }

    static boolean isCLosingBracket(char ch)
    {
        return ch == ')' || ch == '}' || ch == ']';
    }

    static boolean isOppositeBrackets(char a, char b)
    {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();

        Stack<Character> bracket_stack = new Stack<>();
        Stack<Integer> index_stack = new Stack<>();

        int i;
        for(i=0;i<=str.length()-1;i++)
        {
            if(isOpeningBracket(str.charAt(i)))
            {
                bracket_stack.push(str.charAt(i));
                index_stack.push(i);
            }
            else if(isCLosingBracket(str.charAt(i)))
            {
                if(bracket_stack.isEmpty())
                {
                    System.out.println(i+1);
                    return;
                }
                else if(!isOppositeBrackets(bracket_stack.peek(),str.charAt(i)))
                {
                    System.out.println(i+1);
                    return;
                }
                else
                {
                    bracket_stack.pop();
                    index_stack.pop();
                }
            }
        }

        if(!bracket_stack.isEmpty())
            System.out.println(index_stack.firstElement()+1);
        else
            System.out.println("Success");

    }
}









