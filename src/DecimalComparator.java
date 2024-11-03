public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        // Format both numbers to 3 decimal places and compare the resulting strings
        String firstNumber = String.format("%.3f", numberOne);
        String secondNumber = String.format("%.3f", numberTwo);

        // firstNumber.equals(secondNumber) will correctly compare the content of the two formatted strings,
        // returning true if they match up to three decimal places and false otherwise.
        return firstNumber.equals(secondNumber);
    }

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.4567, 3.456);
        System.out.println(result); // This should output 'true'
    }
}


// TODO Decimal Comparator
    /*

    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
    Otherwise, return false.

    */
