package Operatorprecedance;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
        int b = 5;
        int c = 10;
        float rs = 0;
        rs = a + (++b)* ((c / a)* b);
        System.out.println("The result is:" + rs);
	}

}
