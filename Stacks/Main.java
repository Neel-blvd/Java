package Stacks;

class Main
{
    public static void main(String[] args)
    {
        Stack s1=new ExpandableStack(3);
        //Stack s2=new ExpandableStack();

        s1.push(220);
        s1.push(125);
        s1.push(971);
        s1.push(9);
        s1.push(-237);
        s1.display();
        if(s1.isFull())
            System.out.println("Stack is full");
        if(s1.isEmpty())
            System.out.println("Stack is empty");

        s1.push(17);
        s1.push(-800);
        s1.display();
//        if(s1.isFull())
//            System.out.println("Stack is full");
//        if(s1.isEmpty())
//            System.out.println("Stack is empty");
        s1.push(5000);
        s1.display();
    }
}
