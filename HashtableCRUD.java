import java.util.*;

class HashtableCRUD
{
    public static void main(String args[])
    {
        Hashtable<Integer, String> ht = new Hashtable<>();

        // CREATE
        ht.put(1, "Mango");
        ht.put(2, "Apple");
        ht.put(3, "Banana");
        System.out.println("After adding: " + ht);

        // READ
        System.out.println("Read Elements from Hashtable:");
        for(Map.Entry<Integer, String> entry : ht.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // UPDATE
        ht.put(1, "Guava");   
        System.out.println("After Update: " + ht);

        // DELETE
        ht.remove(3);
        System.out.println("After Deletion: " + ht);
    }
}