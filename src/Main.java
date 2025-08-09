import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

//        int x = 10;
//        int y = 2;
//        int z = 10;
//
//        z = x + y;
//        z = x - y;
//        z = x * y;
//        z = x / y;
//
//        System.out.println(z);
//
//        x += y;
//        x++;
//        x--;
//
//        System.out.print(x);
//
//        // Order od operation ParentesisExponentsMoltiplicationDivisionAdditionSubtraction
//
//        double result = 3 + 4 * (7 - 5) / 2.0;
//
//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item do you want to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.println("how many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " +quantity+ " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();
    }
}
