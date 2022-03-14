package series;

public class double1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=Double.parseDouble(args[0]);
        long a=4545454544545l;
        long b=4545454544545L;
        System.out.println(b);
        double sum=0.0;
        for(int i=1;i<=n;i++)
               sum=sum+(1.0/i);
        System.out.println("Sum is "+sum);
       
	}

}
