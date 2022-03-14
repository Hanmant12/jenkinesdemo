package interfaceex;
//Java program demo for Multipath Inheritance
class Aa
{    void show()
    {    System.out.println ("Iam in class A");
    }
} class Ba extends Aa
{    void show()
    {    System.out.println ("Iam in class B");
    }
} interface Ca
{    public void show1();
}
class Da extends Ba implements Ca
{    void show()
    {    System.out.println ("Iam using Class B in class C");
    }public void show1()
    {    System.out.println ("Iam using interface class");
    }
} class Ea extends Aa
{    void show()
    {    System.out.println ("Iam in class E");
    }
}
public class multipath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Aa a=new Aa();a.show(); 
		 Ba b=new Ba() ;
		 b.show();
		 Ea e=new Ea();
		 e.show();  Ca c;
         Da d=new Da();
         d.show(); 
//         c=new Da();
//         c.show1();
	}

}
