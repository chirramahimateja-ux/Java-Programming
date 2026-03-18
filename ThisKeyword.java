public class ThisKeyword {

    int x;

    // Constructor
    ThisKeyword(int x) {
        this.x = x;   // this.x refers to instance variable
    }

    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {

        ThisKeyword obj1 = new ThisKeyword(10);
        ThisKeyword obj2 = new ThisKeyword(25);

        obj1.display();
        obj2.display();
    }
}
