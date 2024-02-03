package Queues;

class Queue
{
    int[] arr;
    int front,rear;
    int size;

    Queue()
    {
        arr=new int[20];
        front=0;
        rear=-1;
        size=20;
    }
    Queue(int size)
    {
        this.arr=new int[size];
        this.front=0;
        this.rear=-1;
        this.size=size;
    }

    void enqueue(int item)
    {
        if(!isFull())
            arr[++rear]=item;
        else
        {
            System.out.println("The Queue is Full,cannot insert further");
        }
    }

    void dequeue()
    {
        if(!isEmpty())
            front++;
        else
        {
            System.out.println("The Queue is Empty,nothing to remove");
        }
    }

    void display()
    {
        for(int i=front;i<=rear;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    boolean isFull()
    {
        return rear==size-1;
    }

    boolean isEmpty()
    {
        return rear==-1;
    }
}
