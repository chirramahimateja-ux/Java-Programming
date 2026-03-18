import java.util.*;
class IteratorDemo
{
      public static void main(String args[])
      {
            ArrayList<Integer> li = new ArrayList<>();
            li.add(10);
            li.add(20);
            li.add(30);
            li.add(40);
            li.add(50);
            Iterator<Integer> itr= li.iterator();
            while(itr.hasNext())
            {
                   int num= itr.next();
                   if(num==15)
                   {
                        itr.remove();
                   }
            }
            System.out.println(li);
      }
}
