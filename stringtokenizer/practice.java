package stringtokenizer;

import java.util.StringTokenizer;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer s=new StringTokenizer("hello hanmant");
		System.out.println(s.countTokens());
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}
	}

}
