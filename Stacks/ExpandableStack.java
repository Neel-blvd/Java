package Stacks;

class ExpandableStack extends Stack
{
    ExpandableStack(int size)
    {
        super(size);
    }
    ExpandableStack()
    {
        super();
    }

    @Override
    void push(int item)
    {
        if(endPtr == size-1)
        {
            int[] temp=new int[2*size];
            for(int i=0;i<=endPtr;i++)
            {
                temp[i]=arr[i];
            }

            arr=temp;
            size=2*size;
        }

        arr[++endPtr]=item;
    }
}
