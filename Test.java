interface A {
    void display();
}

interface B {
    void show();
}

class Test implements A, B {

    public void display() {
        System.out.println("Interface A");
    }

    public void show() {
        System.out.println("Interface B");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        obj.show();
    }
}
