package BinaryTrees;

import java.util.Scanner;

class BinaryTree
{
    Node root;
    int size;
    class Node
    {
        String value;
        Node left;
        Node right;

        Node()
        {
            this.value=null;
            this.left=null;
            this.right=null;
        }
        Node(String value)
        {
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }

    void populate()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of the root node");
        String value=sc.next();
        root=new Node(value);
        populate(root);
        sc.close();
    }

    void populate(Node node) //Starts populating the entire list, from the argument node as root
    {
        //No base condition as recursive call is itself conditional
        //node can never be null creating no NPE
        Scanner sc=new Scanner(System.in);

        System.out.println("Do you want to enter a leftward node of "+node.value+"?");
        boolean response=sc.nextBoolean();
        if(response)
        {
            System.out.println("Enter the value of the leftward node of "+node.value);
            String value=sc.next();
            node.left=new Node(value); size++;
            populate(node.left);  //"node.left" can never be null due to the previous line
        }

        System.out.println("Do you want to enter a rightward node of "+node.value+"?");
        response=sc.nextBoolean();

        if(response)
        {
            System.out.println("Enter the value of the rightward node of "+node.value);
            String value=sc.next();
            node.right=new Node(value); size++;
            populate(node.right);  //"node.right" can never be null due to the previous line
        }
        sc.close();
    }

    void display()
    {
        if(root==null)
        {
            System.out.println("The binary tree is empty,nothing to display");
            return;
        }
        display(root);
    }

    void display(Node node) //Displays all nodes from the argument node in preorder fashion
    {
        if(node==null)
        {
            return;
        }

        //This is getting displayed in DFS preorder fashion
        System.out.print(node.value+" ");
        display(node.left);
        display(node.right);
    }

    void insert(String value,String direction)
    {
        Node temp=root;

        for(int i=0;i<direction.length()-1;i++)
        {
            if(direction.charAt(i)=='L' || direction.charAt(i)=='l')
                temp=temp.left;
            else
                temp=temp.right;
        }

        if(direction.charAt(direction.length()-1)=='L' || direction.charAt(direction.length()-1)=='l')
        {
            Node newNode=new Node(value);
            temp.left=newNode;
        }
        else if(direction.charAt(direction.length()-1)=='R' || direction.charAt(direction.length()-1)=='r')
        {
            Node newNode=new Node(value);
            temp.right=newNode;
        }
    }


}
