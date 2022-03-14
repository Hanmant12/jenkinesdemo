package interfaceex;
interface iface1
{    public void show();
}
interface iface2
{    public void disp();
}
class impl implements iface1,iface2
{    public void show() { System.out.println("iface1 method"); }
    public void disp() { System.out.println("iface2 method"); }
}
public class twointerface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iface1 i1 = new impl();
        iface2 i2 = new impl();
        i1.show();
        i2.disp();
	}

}
