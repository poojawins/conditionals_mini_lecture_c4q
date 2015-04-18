package nyc.c4q.poojawins;

/**
 * Created by pooja on 4/18/15.
 */
public class Assessment {

    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isOdd(2));

        System.out.println(isMultipleOfThree(6));
        System.out.println(isMultipleOfThree(7));

        System.out.println(isOddAndIsMultipleOfThree(9));
        System.out.println(isOddAndIsMultipleOfThree(7));
        System.out.println(isOddAndIsMultipleOfThree(6));

    }

    public static boolean isOdd(int n) {
        return (n % 2 != 0);

//        if (n % 2 != 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);

//        if (n % 3 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        return (isOdd(n) && isMultipleOfThree(n));
    }
}
