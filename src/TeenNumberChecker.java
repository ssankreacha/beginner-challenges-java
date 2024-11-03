public class TeenNumberChecker {
    // Part 1
    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree) {

        if (teenOne >= 13 && teenOne <=19 || teenTwo >= 13 && teenTwo <= 19 || teenThree >= 13 && teenThree <= 19) {
        return true;
        } else {
        return false;
        }
    }

    // Part 2
    public static boolean isTeen(int teenFour) {
        if (teenFour >= 13 && teenFour <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(13));
    }
}


// TODO Teen Number Checker
    /*
    Part 1:

    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    Write a method named hasTeen with 3 parameters of type int.
    The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
    Otherwise return false.

    Part 2:

    Write another method named isTeen with 1 parameter of type int.
    The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
    Otherwise return false.
    */
