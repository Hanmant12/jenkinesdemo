package Stringbuffre;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer strBuf1 = new StringBuffer("SRI");
			        StringBuffer strBuf2 = new StringBuffer(100);
			        StringBuffer strBuf3 = new StringBuffer();
			        System.out.println("strBuf1 : " + strBuf1);
			        System.out.println("strBuf2 capacity:"+strBuf2.capacity());
			        System.out.println("strBuf3 capacity:"+strBuf3.capacity());
			        System.out.println("***********");
			        StringBuffer sb =new StringBuffer("Hello");
	                System.out.println("buffer= " +sb);
	                System.out.println("length= " +sb.length());
	                System.out.println("capacity= " +sb.capacity());
	              String s;
	                int a = 42;
	                StringBuffer sb1= new StringBuffer(40);
	                     s= sb1.append("a=").append(a).append("!").toString();
	                System.out.println(s);
	                StringBuffer sb2 = new StringBuffer("I JAVA!");
	                sb2.insert(2, "LIKE");
	                System.out.println(sb2);
	}

}
