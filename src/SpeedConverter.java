public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            // 1 mile == 1.609 kilometers
            double milesPerHour = kilometersPerHour / 1.609;
            // returns calculation of type long
            return (long) milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {

        // Calculate milesPerHour from kilometersPerHour parameter
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = kilometersPerHour / 1.609;
            double milesPerHourR = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHourR + " mi/h ");
        }
    }

    public static void main(String[] args) {
        long miles = toMilesPerHour(-1);
        System.out.println(miles);
        printConversion(10.25);

    }
}

// TODO Speed Converter
    /*

    1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour
    This method needs to return the rounded value of the calculation of type long.

    If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.

    */
