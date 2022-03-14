package linkedlist;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		String [ ] names = {"Ann", "Bob", "Carol"};
		for (int k = 0; k < names.length; k++)
			nameList.add(names[k]);
		 java.util.Iterator<String> it = nameList.iterator();
		 while (it.hasNext())
			 System.out.println(it.next());
	}

}
