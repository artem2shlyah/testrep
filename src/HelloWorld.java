import java.util.ArrayList;

public class HelloWorld {
    public static void main (String[] args) {
        ArrayList<String> phrase = new ArrayList<String>();
        phrase.add("Hello");
        phrase.add(" ");
        phrase.add("World!");
        for (String word : phrase) {
            System.out.print(word);
        }
        System.out.println();
    }
}
