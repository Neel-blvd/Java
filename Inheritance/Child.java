package Inheritance;

class Child extends Parent
{
    int a,b,c;
    void func()
    {
        System.out.println("func");
    }
    @Override
    public void hi()
    {
        System.out.println("Child method got called");
    }
    void career()
    {
        System.out.println("Child career");
    }

    Child()
    {
        super();
        this.a=0;
        this.b=0;
        this.c=0;
    }
    Child(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static void main(String[] args) {
        Child c1=new Child();
        System.out.println(c1.D);
    }
}
