import java.util.Date;
import java.util.Calendar;
/*
 Q 10 : WAP to print the message of the day using switch statement.
*/

public class Greet_Using_Switch {
    public static void main(String[] args) {

        /* creating a new object of Date class */
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
        case 1:
            System.out.println("Today is Sunday");
            break;
        case 2:
            System.out.println("Today is Monday");
            break;
        case 3:
            System.out.println("Today is Tuesday");
            break;
        case 4:
            System.out.println("Today is Wednesday");
            break;
        case 5:
            System.out.println("Today is Thursday");
            break;
        case 6:
            System.out.println("Today is Friday");
            break;
        case 7:
            System.out.println("Today is Saterday");
            break;
        default:
            System.out.println("Sorry only 7 days celibrate on earth");
        }
    }
}