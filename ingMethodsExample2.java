class StringMethodsExample2
{
    public static void main(String[] args)
    {
        String s = "  Welcome To Java  ";

      
        System.out.println("Length: " + s.length());


        System.out.println("Uppercase: " + s.toUpperCase());

        
        System.out.println("Lowercase: " + s.toLowerCase());

                System.out.println("Trimmed: '" + s.trim() + "'");

        
        System.out.println("Character at index 3: " + s.charAt(3));

               System.out.println("Substring: " + s.substring(2, 9));

                System.out.println("Contains 'Java': " + s.contains("Java"));

            System.out.println("Equals 'Welcome To Java': "
                + s.trim().equals("Welcome To Java"));
    }
}