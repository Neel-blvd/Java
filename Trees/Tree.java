package Trees;

import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Scanner;

public class Tree
{
    static class Node
    {
        String value;
        ArrayList<Node> next;

        Node(String value)
        {
            this.value = value;
            this.next = new ArrayList<>();
        }
    }

    Node root;
    int size;


    void insert(String rootValue)
    {
        root=new Node(rootValue);
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
}


