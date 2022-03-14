package interfaceex;
//Java program demo for Multiple Inheritance
class A1
{    void show()
    {    System.out.println ("Iam in Class A");
    }
}
interface B1
{    public void show1();
}
class C1 extends A1 implements B1
{    void show()
    {    System.out.println ("Iam using Class A  in Class C");
    }
    public void show1()
    {    System.out.println ("Iam using interface Class");
    }
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();  a.show();
        B1 b;
        b=new C1();
        b.show1();
        C1 c=new C1();  c.show();
	}

}
