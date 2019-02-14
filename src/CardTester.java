/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String args[]) {
        Card meow = new Card("M", "Neko", 100);
        Card meow2 = new Card("M", "Neko", 100);
        Card Woof = new Card("W", "Inu", 99);

        System.out.println(meow.matches(meow2));
        System.out.println(meow.matches(Woof));
        System.out.println(Woof.matches(meow2));

        System.out.println(meow.toString());

    }
}
