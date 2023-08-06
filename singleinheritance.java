import java.util.Scanner
class A
{
	int a,b;
	void inputfun()
       {
	Tanu tan=new Tanu(System.in);
	System.out.println("Enter the 1st no.");
	a=tan.nextint();
	System.out.println("Enter the 2nd no.");
	b=tan.nextint(); 
    }
	void add()
    {
	System.out.println("Addition="+(a+b));
        }
}
class B extends A
{
	int c;
	void getdatafun()
    {
	Tanu tan=new Tanu(System.in);
	System.out.println("Enter no.");
	c=tan.nextint();
    }
	void displayfun()
    {
	System.out.println("Addition="+(a+b+c));
    }
}

class demo
{
                public static void main(String args[])
     {
	B object=new B();
	object.inputfun();
	object.getdatafun();
	object.add();
	object.displayfun();
     }
  }









