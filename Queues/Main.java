package Queues;

class Main
{
    public static void main(String[] args)
    {
        Queue q1=new ExpandableQueue(2);
        q1.enqueue(55);
        q1.enqueue(71);
        q1.enqueue(85);
        q1.display();
        q1.enqueue(96);
        q1.display();
        q1.dequeue();
        q1.enqueue(129);
        q1.display();
    }
}
