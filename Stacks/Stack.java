package Stacks;

class Stack
{
    int[] arr;
    int size;  //Size of the ARRAY
    int endPtr;   //Pointer that always points to the last inserted element

    Stack(int sizee)
    {
        arr=new int[size];
        size=sizee;
        endPtr=-1;
    }
    Stack()
    {
        arr=new int[20];
        size=20;
        endPtr=-1;
    }

    void push(int item)
    {
        if(endPtr == size-1)
        {
            System.out.println("The stack is full,can't push");
        }
        else
            arr[++endPtr]=item;
    }

    void pop()
    {
        if(endPtr == -1)
        {
            System.out.println("The stack is empty,can't pop");
        }
        else
            endPtr--;
    }

    void display()
    {
        for(int i=0;i<=endPtr;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    boolean isFull()
    {
        return endPtr == size - 1;
    }

    boolean isEmpty()
    {
        return endPtr == -1;
    }
}
