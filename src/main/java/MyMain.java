import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        // System.out.println("enter a number");
        // int a = scan.nextln();
        if (a > b && a < c || a < b && a > c) {
            return a;
        }
        else if (b > a && b < c || b < a && b > c) {
            return b;
        }
        else {
            return c;
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        double absoluteA = Math.abs(a);
        double absoluteB = Math.abs(b);
        if (absoluteA > absoluteB) {
            return a;
        }
        else {
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double equation = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return equation;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        // System.out.println(median(1, 2, 3)); // should be 2
        // System.out.println(magnitude(-7, -1)); // should be -7
        // System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to run median, magnitude, or pythagoras?");
        String method = scan.next();
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter a number");
        int b = scan.nextInt();
        System.out.println("enter a number");
        int c = scan.nextInt();


        if (method.equals("median")) {
            System.out.println(median(a, b, c));
        }
        else if (method.equals("magnitude")) {
            System.out.println(magnitude(a, b));
        }
        else {
            System.out.println(pythagoras(a, b));
        }


        }
    }

