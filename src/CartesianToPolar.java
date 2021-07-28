/**
 * Polar coordinates. Write a program CartesianToPolar.java that converts from Cartesian to polar coordinates.
 * Your program should take two real numbers x and y on the command line and print the polar coordinates r and θ.
 * Use the Java method Math.atan2(y, x),
 * which computes the arctangent value of y/x that is in the range from -π to π.
 */

//This logic is incorrect
// Please refer to https://mathworld.wolfram.com/PolarCoordinates.html as the radial coordinates (r) and degree (0) of tilt are known
// and we need to calculate x cordinate as x=rcos0 and y=rsin0 and this value is doubble and it need to be considered

public class CartesianToPolar {
    public static void main(String[] args) {
        try {
            String X = "";
            String Y = "";
            double x = Double.parseDouble(X);
            double y = Double.parseDouble(Y);

            double r = Math.sqrt(x * x + y * y);
            double theta = Math.atan2(y, x);

            System.out.println("r     = " + r);
            System.out.println("theta = " + theta);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
