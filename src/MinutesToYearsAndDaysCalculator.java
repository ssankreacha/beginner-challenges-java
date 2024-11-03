public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {

        // 1000000 minutes = 1.90258752 year(s)
        // 10000 minutes = 6.944444 days(s)
        long days = (long) ((minutes * 6.9444) / 10000);
        long years = (long) ((minutes * 1.90258752) / 1000000);

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y " + days + " d ");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays((long) 1000000.00);
    }
}


// TODO Minutes Years Days Calculator
    /*

   Write a method printYearsAndDays with parameter of type long named minutes.
   The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
   If the parameter is less than 0, print text "Invalid Value".

   Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

   XX represents the original value minutes.
   YY represents the calculated years.
   ZZ represents the calculated days.

    */
