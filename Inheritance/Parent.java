package Inheritance;

public class Parent
{
    protected int A,B,C;
    int D=493;
    protected String s="neelWOconstructor";
    void FUNC()
    {
        System.out.println("FUNC");
    }
    protected void hi()
    {
        System.out.println("Parent method got called");
    }
    public Parent()
    {
        this.A=18;
        this.B=0;
        this.C=0;
        //this.D=171;
        this.s="neelWconstructor";
    }
    public Parent(int A,int B,int C)
    {
        this.A=A;
        this.B=B;
        this.C=C;
    }
}
