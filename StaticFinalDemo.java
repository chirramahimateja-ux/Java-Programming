public class StaticFinalDemo {

    static int count = 0;        // static variable
    final int MAX = 100;         // final variable

    StaticFinalDemo() {
        count++;
        System.out.println("Object created. Count = " + count);
    }

    static void showCount() {    // static method
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {

        StaticFinalDemo obj1 = new StaticFinalDemo();
        StaticFinalDemo obj2 = new StaticFinalDemo();
        StaticFinalDemo obj3 = new StaticFinalDemo();

        showCount();

        System.out.println("Final variable MAX = " + obj1.MAX);
    }
}
