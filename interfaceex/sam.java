package interfaceex;
 class x
{    public void show()
    {    System.out.println ("SUPER");
    }
}

 class y
{    public void display()
    {    System.out.println("SUB");
    }
}
public class sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 x obj=new x();
         obj.show();
         y obj1=new y();
         obj1.display();
	}

}
