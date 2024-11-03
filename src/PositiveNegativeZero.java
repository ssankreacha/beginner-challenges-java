public class PositiveNegativeZero {
    public static void checkWinner(int number) {

        if (number > 0) {System.out.println("Positive");
        } else if (number < 0) {System.out.println("Negative");
        } else if (number == 0 || number == -0) {System.out.println("Zero");
        }
    }

    public static void main(String[] args) {checkWinner(0);}
}

// TODO Positive Negative Zero
    /*

    Write a method called checkNumber with an int parameter named number.
    The method should not return any value, and it needs to print out:

    */
