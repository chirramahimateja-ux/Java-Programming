class constructorPerson
{
string name;
int roll no;
string dept;
constructorperson()
{
name="not assigned";
roll no=0;
dept="not assigned";
}constructorperson(string n,int i)
{
name=n;
roll no=i;
}
constructorperson(string n, int i, string c)
{
name=n;
roll no=i;
dept=d;
}
void display()
system.out.println("Name:" + name);
system.out.println("Roll no:" + roll no);
system.out.println("DEPT:" + dept);
system.out.println();
    }

    public static void main(String[] args)
    {
        ConstructorPerson p1 = new ConstructorPerson();
        ConstructorPerson p2 = new ConstructorPerson("mahi", 101);
        ConstructorPerson p3 = new ConstructorPerson("deepu", 102, "Aiml");

        p1.display();
        p2.display();
        p3.display();
    }
}
