package Queues;

class ExpandableQueue extends Queue
{
    ExpandableQueue()
    {
        super();
    }
    ExpandableQueue(int size)
    {
        super(size);
    }

    void enqueue(int item)
    {
        if(isFull())
        {
            int[] temp=new int[2*size];
            for(int i=front;i<=rear;i++)
                temp[i]=arr[i];

            arr=temp;
            size=2*size;
        }

        arr[++rear]=item;
    }
}
