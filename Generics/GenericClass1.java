package Generics;

public class GenericClass1<T extends Number>
{
    T x;
    T y;
    T z;
    T sum;

    public GenericClass1(T x, T y, T z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // T func()
    // {
    //     //return (T) Integer.valueOf((Integer)x + (Integer)y + (Integer) z + 100);
    // }

    public static void main(String[] args)
    {
        //GenericClass1<Integer> obj1=new GenericClass1<>(10,20,30);

        //System.out.println(obj1.func());
        //System.out.println(obj1.x+obj1.y+obj1.z);


    }


}
