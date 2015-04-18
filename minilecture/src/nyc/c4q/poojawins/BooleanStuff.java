package nyc.c4q.poojawins;

/**
 * Created by pooja on 4/18/15.
 */
public class BooleanStuff {

    public static void main(String[] args) {
        largerInt(15, 7);
        largerInt(7, 7);
        largerInt(7, 15);

        numStuff(15, 7);
        numStuff(7, 7);
        numStuff(7, 15);

        System.out.println(isTeen(15));
        System.out.println(isTeen(11));
        System.out.println(isTeen(41));

        isBirthday(true);
        isBirthday(false);

        isNotBirthday(true);
        isNotBirthday(false);

        getMeToGym(true);
        getMeToGym(false);

        getMeToGymTwo(true);
        getMeToGymTwo(false);
    }

    public static void largerInt(int first, int second) {
        if (first > second) {
            System.out.println(first + " is bigger!");
        } else if (first == second) {
            System.out.println("They are the same!");
        } else {
            System.out.println(second + " is bigger");
        }
    }

    public static void numStuff(int first, int second) {
        if (first > second && isTeen(first)) {
            System.out.println("You're only a teen but you're older!");
        } else {
            System.out.println("Everything is meaningless");
        }
    }

    public static boolean isTeen(int num) {
//        if (num > 12 && num < 20) {
//            return true;
//        } else {
//            return false;
//        }

        return (num > 12 && num < 20);
    }

    public static void isBirthday(boolean bday) {
        if (bday) {
            System.out.println("Sing happy birthday!");
        }
    }

    public static void isNotBirthday(boolean bday) {
        if (!bday) {
            System.out.println("It's not your birthday.");
        }
    }

    public static void getMeToGym(boolean correctWay) {
        if(correctWay) {
            System.out.println("You're almost there!");
        } else {
            System.out.println("You are going the wrong way!");
        }
    }

    public static void getMeToGymTwo(boolean correctWay) {
        if(!correctWay) {
            System.out.println("You are going the wrong way!");
        } else {
            System.out.println("You're almost there!");
        }
    }
}
