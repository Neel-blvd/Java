package LinkedLists;

//import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        LL list1=new LL();

        list1.insertLast("9");
        list1.insertLast("1800");
        list1.insertLast("2");
        list1.insertLast("-500");
        list1.insertLast("84");
        if(list1.hasCycle())
            System.out.println("Cycle Exists");
        else {
            System.out.println("Cycle does not Exist");
        }
        System.out.println("Length="+list1.lengthOfCycle());

        list1.tail.next=list1.head;   //CYCLE FORMATION in the LINKED LIST

        if(list1.hasCycle())
            System.out.println("Cycle Exists");
        else{
            System.out.println("Cycle does not Exist");
        }

        list1.display();

        list1.tail.next=null;

        if(list1.hasCycle())
            System.out.println("Cycle Exists");
        else{
            System.out.println("Cycle does not Exist");
        }

        list1.display();
        list1.firstCycleNode();
    }
}