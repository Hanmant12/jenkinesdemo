package series;
//1/1 + 1/2 + 1/22 + ...... + 1/2n.
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n=Integer.parseInt(args[0]);
          double sum=0.0;
       for(int i=0;i<=n;i++)
          sum=sum+(1.0/Math.pow(2,i));
     System.out.println("Sum is "+sum);
	}

}
