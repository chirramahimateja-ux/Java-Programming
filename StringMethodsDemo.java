public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello Aditya University";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));
        System.out.println("Contains 'Aditya': " + str.contains("Aditya"));
        System.out.println("Replace 'University' with 'College': " +
                str.replace("University", "College"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Trim example: '" + "  Hello  ".trim() + "'");
    }
}
