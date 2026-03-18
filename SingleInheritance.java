class Laptop
{
 void display()
{
 System.out.println("This is Laptop(parent class)");
} 
}
  class Hp extends Laptop
{
 void display()
{
 System.out.println("Hp is a child class");
}
}
class Dell extends Hp
{
 void display()
{
 //super.display();
 System.out.println("Dell is a child 2");
}
}
 
 class SingleInheritance
{
 public static void main(String[] args)
{
  Laptop L = new Hp();
 Laptop a=new Dell();
 L.display();
a.display();
}
}
