package LinkedLists;

class LL
{
    Node head;
    Node tail;
    int size;
    class Node
    {
        String value;
        Node next;

        Node()
        {
            this.value=null;
            this.next=null;
        }
        Node(String value)
        {
            this.value = value;
            this.next=null;
        }
    }

    void insertFirst(String value)
    {
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;

        if(tail==null)
            tail=head;
        size++;
    }

    void insertLast(String value)
    {
        Node newNode=new Node(value);
        if(head==null && tail==null)
        {
            head=newNode;
            tail=head;
            tail.next=null;
            size++;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
            tail.next=null;
            size++;
        }
    }

    void insertAtIndex(String value,int index)
    {
        if(index==0)
            insertFirst(value);
        else if(index==size)
            insertLast(value);
        else
        {
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 1; i <= index - 1; i++)
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    void deleteFirst()
    {
        head=head.next;
        size--;
    }
    void deleteLast()
    {
        Node temp;
        for(temp=head;temp.next.next!=null;temp=temp.next) {}
        tail=temp;
        temp.next=null;
        size--;
    }

    void deleteAtIndex(int index)
    {
        if(index==0)
            deleteFirst();
        else if(index==size-1)
            deleteLast();
        else
        {
            Node temp=head;
            for(int i = 1; i <= index - 1; i++)
            {
                temp = temp.next;
            }
            temp.next=temp.next.next;
            //temp.next.next=null;
            size--;
        }
    }

    void deleteNode(Node node)
    {
        if(node==head)
            deleteFirst();
        else if(node==tail)
            deleteLast();
        else
        {
            for(Node temp=head;temp!=null;temp=temp.next)
            {
                if(temp.next==node)
                {
                    temp.next=temp.next.next;
                    size--;
                }
                else
                    continue;
            }
        }
    }

    String getValue(int index)
    {
        Node temp=head;
        for(int i=0;i<=index-1;i++)
        {
            temp=temp.next;
        }
        return temp.value;
    }

    void display()
    {
        if(this.hasCycle())
        {
            int flag=0;
            for(Node temp=head;(flag==0 || temp!=this.lastCycleNode().next);temp=temp.next)
            {
                System.out.print(temp.value + " ");

                if(temp==this.lastCycleNode().next)
                    flag=1;
            }
            System.out.println("\nThe Linked List has a cycle of length "+this.lengthOfCycle()+" starting from "+this.firstCycleNode().value+" and ending at "+this.lastCycleNode().value);
            System.out.println();

            return;
        }

        Node temp;
        for(temp=head;temp!=null;temp=temp.next)
        {
            System.out.print(temp.value+" ");
        }
       System.out.println();
       System.out.println("The Linked List has a size of "+size);
       System.out.println();
    }

    void reverse()
    {
        int i,j;
        String temp;
        Node temp1,temp2;
        for(temp1=head,i=0;temp1!=null;temp1=temp1.next,i++)
        {
            if(i>=size/2)
                return;

            for(temp2=head,j=0;j<=size-2-i;j++)
            {
                temp2=temp2.next;
            }
            temp=temp1.value;
            temp1.value=temp2.value;
            temp2.value=temp;
        }
    }

    void removeDuplicates()
    {
        Node temp1,temp2;
        for(temp1=head;temp1!=null;temp1=temp1.next)
        {
            for(temp2=head;temp2!=null;temp2=temp2.next)
            {
                if(temp2==temp1)
                    continue;
                if((temp2.value).equals(temp1.value))
                {
                    deleteNode(temp2);
                }
            }
        }
    }

    void removeDuplicatesSorted()
    {
        Node f=head;
        Node s;
        for(s=head.next;s!=null;s=s.next)
        {
            if((s.value).equals(f.value))
                continue;
            else
            {
                f.next=s;
                f=s;
            }
        }
        //tail=f;
        f.next=null;
    }

    boolean hasCycle()
    {
        if(head==null)
        {
            System.out.println("The Linked List is Empty");
            return false;
        }

        Node slow=head,fast=head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

    int lengthOfCycle()
    {
        if(!this.hasCycle())
        {
            System.out.println("The Linked List does not even have a cycle");
            return 0;
        }

        Node slow=head,fast=head.next;
        while(fast.next!=null)
        {
            if(slow==fast)
                break;
            slow=slow.next;
            fast=fast.next.next;
        }

        int length=0;
        do
        {
            slow=slow.next;
            length++;
        }
        while(slow!=fast);

        return length;
    }

    Node firstCycleNode()
    {
        if(!this.hasCycle())
        {
            System.out.println("The Linked List does not even have a cycle");
            return null;
        }

        Node first=head;
        Node second=head;
        for(int i=1;i<=this.lengthOfCycle();i++)
            second=second.next;
        while(first!=second)
        {
            first=first.next;
            second=second.next;
        }
        return first;// OR return second,it works too because it's equal to first
    }

    Node lastCycleNode()
    {
        Node temp=this.firstCycleNode();
        for(int i=1;i<=this.lengthOfCycle()-1;i++)
            temp=temp.next;
        return temp;
    }
}
