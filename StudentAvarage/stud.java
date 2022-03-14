package StudentAvarage;
import java.util.*;
public class stud
{
	private int i,n,avg,total;
	private int a[]=new int [10];
	public String s=new String();
	public Scanner sc=new Scanner(System.in);
	public void read()
	{
		System.out.println("enter the std name");
		s=sc.nextLine();
		System.out.println("enter the std id");
		n=sc.nextInt();
		System.out.println("enter the std 6 sub mark");
		for (int i = 0; i < 6; i++) {
			a[i]=sc.nextInt();
		}
		
	}
	public void calculate()
	{
		for (int i = 0; i < 6; i++) {
			total+=a[i];
			avg=(total)/6;
		}
	}
	public void display()
	{
		System.out.println("name"+s);
		System.out.println("id"+n);
		System.out.println("total"+total);
		System.out.println("avg"+avg);
	}

}
