public class InchesFeetCmConverter {

    public static double convertToCentimeters(int heightInInches) {
        // Inches to cm (as double)
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        // Covert feet and inches, to only inches
        // Then call convertToCentimeters() to get cm value (as double) - Thus, total height in inches is required

        int feetToInches = heightInFeet * 12; // Gives Inches
        int totalInches = feetToInches + remainingHeightInInches; // Total height in inches

        return convertToCentimeters(totalInches); // Inches to cm as double
    }

    public static void main(String[] args) {
        // Method calling

        System.out.println(convertToCentimeters(60)); // Part 1
        System.out.println(convertToCentimeters(6, 0)); // Part 2
    }

}

// TODO Inches Feet Cm Converter
    /*

    Both methods should return a real number or decimal value for total height in centimeters
    Call both methods, and print out the results

    The conversion formula from inches to centimeters is 1 inch = 2.54cm
    The conversion formula from feet to inches is 1 foot = 12 inches

    */
