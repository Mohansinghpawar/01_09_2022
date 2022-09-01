// Java program to demonstrate conversion of
// Set to array using addAll() method.

import java.util.*;
class UsingAddAllMethod {
	public static void main(String[] args)
	{

		// Creating a hash set of strings
		Set<String> setObj=null;
        setObj = new HashSet<String>();
		setObj.add("Clayfin..!!");
		setObj.add("technologies...!!!");

		List<String> listObj = new ArrayList<String>();
		listObj.addAll(setObj);

		System.out.println("Created ArrayList is");
		for (String x : listObj)
			System.out.println(x);

		List<String> newLIst = new LinkedList<String>();
		newLIst.addAll(setObj);

		System.out.println("Created LinkedList is");
		for (String x : newLIst)
			System.out.println(x);
	}
}

