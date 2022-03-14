package interfaceex;
//Java program demo for Hybrid Inheritance
class A
{    void show()
    {    System.out.println ("Iam in class a");
    }
}
class Be extends A
{    void show()
    {    System.out.println ("Iam in class B");
    }
}
interface Ce
{    public void show1();
}
class D extends Be implements Ce
{    void show()
    {    System.out.println ("Iam using Class B in class D");
    }
    public void show1()
    {    System.out.println ("Iam using interface");
    }
}
public class hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();a.show();
        Be b=new Be(); b.show();
        Ce c;
        D d=new D();d.show();
        c=new D();c.show1();
	}

}
