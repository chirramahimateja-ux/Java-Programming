import java.util.*;
class ConstructorPerson
{
    String name;
    int id;
    String city;

    ConstructorPerson()
    {
        name = "Not Assigned";
        id = 0;
        city = "Not assigned";
    }

    ConstructorPerson(String n, int i)
    {
        name = n;
        id = i;
        city = "Not assigned";
    }

    ConstructorPerson(String n, int i, String c)
    {
        name = n;
        id = i;
        city = c;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("City: " + city);
        System.out.println();
    }

    public static void main(String[] args)
    {
        ConstructorPerson p1 = new ConstructorPerson();
        ConstructorPerson p2 = new ConstructorPerson("maha", 101);
        ConstructorPerson p3 = new ConstructorPerson("reethu", 102, "Kakinada");

        p1.display();
        p2.display();
        p3.display();
    }
}
