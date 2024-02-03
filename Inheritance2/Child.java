package Inheritance2;
//import Inheritance.Parent;  //The import statement only makes code more readable.
                              //IT DOES NOT DO ANYTHING ELSE(Like Adding lines of code abstractly etc.)
//It only enables you to write "Parent" instead of, "Inheritance.Parent", in this scenario

class Child //extends Inheritance.Parent
{
    public static void main(String[] args)
    {
        //Child n=new Child();
        //n.A=59;// This works completely fine

        //Inheritance.Parent p=new Inheritance.Parent();
        //p.A=59;//This does NOT work as ONLY subclass objects
               //can access protected elements from another package
    }
}
