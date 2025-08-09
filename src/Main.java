public class Main {
    public static void main (String [] args) {

        int x = 10;
        int y = 2;
        int z = 10;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x / y;

        System.out.println(z);

        x += y;
        x++;
        x--;

        System.out.print(x);

        // Order od operation ParentesisExponentsMoltiplicationDivisionAdditionSubtraction

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}
