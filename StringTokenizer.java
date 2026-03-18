import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {

        String data = "Java,Python,C++,AI,ML";

        StringTokenizer st = new StringTokenizer(data, ",");

        System.out.println("Tokens in the string:");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
