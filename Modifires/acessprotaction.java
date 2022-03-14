package Modifires;
 class protect
{    int n=1;
                      private int pri=2;
                      public  int pub=3;
                      protected int pro=4;
                      public protect()
                     {
                       System.out.println("Super Constructor");
                       System.out.println("Default"+n);
                      System.out.println("Private"+pri);
                          System.out.println("Public"+pub);
                          System.out.println("Protected"+pro);
         }
}
 class derive extends protect
 {   
          derive()
             {   
                        System.out.println("Sub Constructor");
                             System.out.println("Default"+n);
           //System.out.println("Private"+pri); // it is private variable in package p1
                           System.out.println("Public"+pub);
                        System.out.println("Protected"+pro);
             }
 }
public class acessprotaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    protect obj=new protect();
	}

}
