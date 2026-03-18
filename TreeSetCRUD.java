import java.util.*;
class TreeSetCRUD
{
		public static void main(String args[])
		{
			TreeSet<String> ts= new TreeSet<>();
			//create
			ts.add("India");
			ts.add("South Africa");
			ts.add("Russia");
			System.out.println("After adding: "+ts);
			//Read
			System.out.println("Read Elements from Treeset: ");
			for(String s: ts)
			{
				System.out.println(s);
			}
			//Update
			ts.remove("Russia");
			ts.add("UK");
			System.out.println("Updated Set: " +ts);
			//Remove
			ts.remove("South Africa");
			System.out.println("After Deletion: "+ts);
		}
}