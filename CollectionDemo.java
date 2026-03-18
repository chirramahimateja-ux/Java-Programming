import java.util.*;
class collectionDemo
{
         public static void main(String args[])
         {
               List <String> names= new ArrayList<>();
               names.add("C");
               names.add("Java");
               names.add("C++");
               names.add("Python");
               System.out.println(names);
               Set<String> set = new HashSet<>(names);
               System.out.println(set);
               Map<Integer, String> map=new HashMap<>();
               Map.put(1, "Deepu");
               Map.put(2, "mahi");
               System.out.println(map);
         }
}