import java.util.Scanner;
public class Comp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d;
        do {
            System.out.println("Please enter day's index");
            d = in.nextInt();
        }
        while (d == 0 | d > 7);
        System.out.println("does not exist");
        if (d == 1) {
            System.out.println("monday");
        } else if (d == 2) {
            System.out.println("tuesday");
        } else if (d == 3) {
            System.out.println("wednesday");
        } else if (d == 4) {
            System.out.println("tuesday");
        } else if (d == 5) {
            System.out.println("friday");
        } else if (d == 6) {
            System.out.println("saturday");
        } else if (d == 7) {
            System.out.println("sunday");
        }
    }

}

