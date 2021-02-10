import java.util.Scanner;
public class Days {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter day's index");
        int days = 7;
        days = in.nextInt();
        String dayString;
        switch (days) {
            case 1: dayString ="monday";
            break;
            case 2: dayString ="tuesday";
            break;
            case 3: dayString ="wednesday";
            break;
            case 4: dayString ="thursday";
            break;
            case 5: dayString ="friday";
            break;
            case 6: dayString ="saturday";
            break;
            case 7: dayString ="sunday";
            break;
            default: dayString ="not exist";
            break;
        }
        System.out.println(dayString);
    }
}
