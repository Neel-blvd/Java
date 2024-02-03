package Coursera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TreeHeight
{
    static class Node {
        String value;
        ArrayList<Node> next;

        Node(String value) {
            this.value = value;
            this.next = new ArrayList<>();
        }
    }

    Node root;
    int size;


    void insert(String rootValue)
    {
        root= new Node(rootValue);
    }
    void insert(String prevValue, String newValue)
    {
        Node prevNode = findNode(root, prevValue);
        prevNode.next.add(new Node(newValue));
    }

    Node findNode(Node temp, String value)
    {
        Node answerNode;

        if (temp == null)
            return null;

        if (temp.value.equals(value))
            return temp;

        for (int index = 0; index <= temp.next.size() - 1; index++)   //"index" is arrayList index
        {
            answerNode=findNode(temp.next.get(index), value);
            if(answerNode!=null)
                return answerNode;
        }
        return null;
    }

    void display()
    {
        display(root);
    }
    void display(Node temp)
    {
        if(temp==null)
            return;

        System.out.println(temp.value);

        for(int index=0;index<=temp.next.size()-1;index++) //"index" is arrayList index
            display(temp.next.get(index));
    }

    int getHeight()
    {
        return getHeight(root);
    }
    int getHeight(Node temp)
    {
        ArrayList<Integer> heights=new ArrayList<>();

        if(temp.next.isEmpty())
            return 1;
        for(int i=0;i<=temp.next.size()-1;i++)
            heights.add(getHeight(temp.next.get(i)));

        return Collections.max(heights)+1;
    }

    public static void main(String[] args)
    {
        TreeHeight t1=new TreeHeight();

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();

        int i;

        for(i=0;i<=n-1;i++)
        {
            if(sc.hasNextInt())
                arr.add(sc.nextInt());
        }

        int root_index=-10;
        for(i=0;i<=n-1;i++)
        {
            if(arr.get(i) ==-1)
            {
                root_index=i;
                break;
            }
        }
        t1.insert(String.valueOf(root_index));

        ArrayList<Integer> children_indices=new ArrayList<>();
        children_indices.add(root_index);
        for(int j=0;j<=children_indices.size()-1;j++)
        {
            for(i=0;i<=arr.size()-1;i++)
            {
                if(arr.get(i)==children_indices.get(j))
                {
                    t1.insert(String.valueOf(arr.get(i)),String.valueOf(i));
                    children_indices.add(i);
                }
            }
        }

        System.out.println(t1.getHeight());
    }
}
