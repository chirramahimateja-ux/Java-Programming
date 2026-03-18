class FinalStaticBlock {
    static final int a;

    static {
        a = 50; 
    }

    public static void main(String[] args) {
        System.out.println("a value: " + a);
    }
}