import java.util.*;

class MapCRUD
{
       public static void main(String args[])
       {
            HashMap<Integer,String> hmap = new HashMap<>();

            // Create
            hmap.put(1,"Java");
            hmap.put(2,"C");
            hmap.put(3,"C++");

            System.out.println(hmap);

            // Read
            for(Map.Entry<Integer, String> entry : hmap.entrySet())
            {
                System.out.println(entry.getKey() + " ---> " + entry.getValue());
            }

            // Update
            hmap.put(2,"Python");
            System.out.println("After updating key 2: " + hmap.get(2));

            // Delete
            hmap.remove(1);
            System.out.println(hmap);
      }
}