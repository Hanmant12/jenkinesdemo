package interfaceex;
interface C
{
    int  res1=1000;
}
class B implements C
{
    void get( )
         {    System.out.println("Well");
        }
}
public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B y=new B();
         System.out.println(B.res1);
//         B.res1=2000;
	}

}
