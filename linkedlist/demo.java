package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> nameList = new LinkedList<String> ();
		 String [ ] names = {"Ann", "Bob", "Carol"}; 
         for (int k = 0; k < names.length; k++)
         {
	         nameList.add(names[k]); 
         }
     for(int k = 0; k < nameList.size(); k++) 
     {
        System.out.println(nameList.get(k));
     }
	}

}
