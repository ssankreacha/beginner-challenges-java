public class SecondsAndMinutes {
    public static String getDurationString(int seconds) {
        // Seconds to hours

        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds
                    + "), must be a positive integer value";
        }
        int minutes = seconds / 60;
        return getDurationString(minutes % 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        // Seconds and minutes

        if (minutes < 0) {
            return "Invalid data for seconds (" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }

    public static void main(String[] args) {
        // Method Calling
        System.out.println(getDurationString(6003));
        System.out.println(getDurationString(65, 45));
    }
}


// TODO Seconds & Minutes
    /*

    We're going to create a method, that takes time, represented in seconds, as the parameter.
    We'll then want to transform the seconds into hours.

    Display the time in hours with the remaining minutes and seconds in a String.
    We'll do this transformation in two steps, which allows us to use overloaded methods.

    Both methods must return a string in the format: XXh, YYm, ZZs
    The first method should in turn call the second method to return its results.

    1 second = 0.000277778 hours
    1 minute = 60 seconds
    1 hour = 60 minutes

    BONUS:

    Add validation...

    The first method, the seconds parameter should be >=0
    The second method, the minutes parameter should be >=0 and the seconds parameter should be >=0, and <=59

    If either method is passed an invalid value, print out some type of meaningful message to the user.


    */