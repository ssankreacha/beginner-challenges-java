public class MegBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1064 KB
        double megaBytes = (double) kiloBytes / 1064;

        if (kiloBytes < 0) {System.out.println("Invalid Value");
        } else {System.out.println(kiloBytes + " KB = " + megaBytes + " MB ");}
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }
}

// TODO MegaByte Converter
    /*

    Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

    */
