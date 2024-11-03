public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // hourOfDay has a valid range of 0-23

        // If dog is barking and time is between 0 & 8...
        if (barking == true && hourOfDay > 0 && hourOfDay < 8) {
            return true;
        // If dog is barking and time is between 22 & 23...
        } else if (barking == true && hourOfDay >= 22 && hourOfDay <= 23) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 2));
    }
}

// TODO Barking Dog
    /*

    We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
    Write a method shouldWakeUp that has 2 parameters.

    1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
    2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

    In all other cases return false.
    */
