package ExceptionHandling;


//import java.util.Collection;

public class Main
{
    public static void main(String[] args)
    {
        short a=5;
        try
        {
            a= (short) (a+5);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(a);




    }
}
