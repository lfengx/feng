import java.util.*;

public class InputTest {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);

        System.out.print("What your name?");
        String name = in.nextLine();

        System.out.print("How old are you?");
        int age = in.nextInt();

        System.out.print("Hello," + name + ".Next year you'll be " + (age + 3));
    }
}