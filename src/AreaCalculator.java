public class AreaCalculator {
    public static double area(double radius) {
        // Area = A=πr2
        double area = 3.14 * (radius * radius);

        // Representing invalid value
        if (radius < 0) {
            return  -1.0; // Representing invalid value
        }

        // Returns area of a circle
        return area;
    }

    public static double area(double x, double y) {
        // Area width * length
        double area = x * y;

        // Representing invalid value
        if (x < 0 && y < 0) {
            return  -1.0;
        }

        // Returns area of rectangle
        return area;
    }

    public static void main(String[] args) {
        System.out.println(area(-2));
        System.out.println(area(5,10));
    }
}


// TODO Area Calculator
    /*

    Write a method named area with one double parameter named radius.
    The method needs to return a double value that represents the area of a circle.
    If the parameter radius is negative then return -1.0 to represent an invalid value.

    Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
    The method needs to return an area of a rectangle.
    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

    */
