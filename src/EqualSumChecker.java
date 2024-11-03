public class EqualSumChecker {
    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {
       // If numberOne + numberTwo = numberThree, return true
        if (numberOne + numberTwo == numberThree) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, -1, 0));
    }
}


// TODO Equal Sum Checker
    /*

    Write a method hasEqualSum with 3 parameters of type int.
    The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter.
    Otherwise, return false.

    */
