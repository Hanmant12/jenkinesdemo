package interfaceex;
class test    //base class
{    int s1,s2,s3;
    void readdata(int x, int y,int z)
    {    s1=x;   s2=y;   s3=z;
    }
}
class percentage extends test    //derived class
{    float avg,sum;
    void percal(int a,int b,int c)
    {    readdata(a,b,c);
                     sum=(super.s1+super.s2+super.s3);  avg=sum/3;
    }   
    void printdata()
    {    System.out.println("Subject s1 Marks="+s1);  System.out.println("Subject s2 Marks="+s2);
        System.out.println("Subject s3 Marks="+s3);  System.out.println("Subject sum="+sum);
        System.out.println("Subject average="+avg);
    }   
}
interface sports    //interface
{    int smarks=55;
    public void printdata();
}
class result extends percentage implements sports    //hybrid & multiple inheritance
{    public void printdata()
    {    super.printdata();   sum=sum+smarks;
        avg=sum/3;
        System.out.println("Subject sum and avg with sportsm\n"+sum+"\n"+avg);
    }
}
public class all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 result r=new result();
         r.percal(66,66,66);   r.printdata();
	}

}
