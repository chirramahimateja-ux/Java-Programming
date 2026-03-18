class StaticVariable
{
   int rollno;
   string name;
   static String clgname="AUS";
   staticVAriable(int r, String n)
   {
     rollno=r;
     name=n;
   }
   void display()
   {
     system.out.println("rollno:" +rollno+ "Name:" +name+ "CAmpus: " +clg);
   }
   public static void main(string args[])
   {
     staticVariable sv1= new StaticVariable(1,"Mahi");
     staticVariable sv2= new StaticVariable(2,"Maha");
     sv1.display();
   }
