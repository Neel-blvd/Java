package Coursera;

import java.util.ArrayList;
import java.util.Scanner;

public class Reachability
{
    private static int reach(ArrayList<Integer>[] adj, int x, int y, Boolean[] node_visited)
    {
        if(node_visited[x-1])
            return 0;
        if(x==y)
            return 1;

        node_visited[x-1]=true;
        for(int i=0;i<=adj[x-1].size()-1;i++)
        {
            if(reach(adj,adj[x-1].get(i),y,node_visited)==1)
                return 1;
        }
        node_visited[x-1]=false;

        return 0;
    }
    private static int reach(ArrayList<Integer>[] adj, int x, int y)
    {
        Boolean[] node_visited=new Boolean[adj.length];
        for(int i=0;i<=node_visited.length-1;i++)
            node_visited[i]=false;
        return reach(adj,x,y,node_visited);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();scanner.close();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y);
            adj[y - 1].add(x);
        }
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(reach(adj, x, y));
    }
}

