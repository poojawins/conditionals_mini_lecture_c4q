package nyc.c4q.poojawins;

/**
 * Created by pooja on 4/18/15.
 */
public class IfElseEtc {

    public static void main(String[] args) {
        System.out.println(barTender(18));
        System.out.println(barTender(21));
        System.out.println(barTender(23));

        System.out.println(gasIndicatorLight(0));
        System.out.println(gasIndicatorLight(1));
        System.out.println(gasIndicatorLight(10));

        System.out.println(trafficLight(0));
        System.out.println(trafficLight(20));
        System.out.println(trafficLight(30));

        teenager(12);
        teenager(13);
        teenager(19);
        teenager(20);
    }

    /**
     * if - else example
     */
    public static String barTender(int age) {
        if (age >= 21) {
            return "What would you like to drink?";
        } else {
            return "Want some soda?";
        }
    }

    /**
     * if - else example
     */
    public static String gasIndicatorLight(int gasInTank) {
        if (gasInTank < 1) {
            return "red";
        } else {
            return "green";
        }
    }

    /**
     * if - else if - else example
     */
    public static String trafficLight(int timeLeft) {
        if (timeLeft <= 0) {
            return "red";
        } else if (timeLeft < 20) {
            return "yellow";
        } else {
            return "green";
        }
    }

    public static void teenager(int age) {
        if (age > 12 && age < 20) {
            System.out.println("you are a teenager");
        }
    }
}
