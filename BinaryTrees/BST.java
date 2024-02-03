package BinaryTrees;

import java.util.Scanner;

class BST extends BinaryTree
{
    void populate()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the root node:");
        String value=sc.next();
        root=new Node(value);

        populate(root);
        sc.close();
    }

    void populate(Node node)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Do you want to insert another node?");
        boolean response=sc.nextBoolean();

        if(!response)
        {
            sc.close();
            return;
        }

        System.out.println("Enter the value of that node");
        String value=sc.next();

        while (node.left!=null || node.right!=null)//Just brings "node" to the right place
        {
            if(value.compareTo(node.value)<0 && node.left!=null)
                node=node.left;
            else if(value.compareTo(node.value)>0 && node.right!=null)
                node=node.right;
            else
                break;
        }

        if(value.compareTo(node.value)<0)  //Actual Insertion
            node.left=new Node(value);
        if(value.compareTo(node.value)>0)  //Actual Insertion
            node.right=new Node(value);

        populate(root);  //Recursive call is made to insert other nodes
        sc.close();
    }
}


