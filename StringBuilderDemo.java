public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Aditya");

        System.out.println("Original: " + sb);

        sb.append(" University");
        System.out.println("After append: " + sb);

        sb.insert(6, " AI&ML");
        System.out.println("After insert: " + sb);

        sb.replace(0, 6, "Welcome to");
        System.out.println("After replace: " + sb);

        sb.delete(0, 11);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
