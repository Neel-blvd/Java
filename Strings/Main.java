package Strings;

//import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of strings to sort");
        int n=sc.nextInt();

        String[] str_arr=new String[n];

        for(int i=0;i<=n-1;i++)
        {
            System.out.println("Enter the string "+(i+1));
            str_arr[i]=sc.next();
        }

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if((str_arr[j].compareTo(str_arr[j+1]))>0)
                {
                    String temp;
                    temp=str_arr[j+1];
                    str_arr[j+1]=str_arr[j];
                    str_arr[j]=temp;
                }
            }
        }

        for(int i=0;i<=n-1;i++)
            System.out.print(str_arr[i]+" ");
        
        sc.close();
    }

}
