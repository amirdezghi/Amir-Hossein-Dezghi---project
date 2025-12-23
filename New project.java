public class Tangent {

    // f(x) = x^2
    public static double f(double x) {
        return Math.pow(x, 2); 
    }

    public static double Slope(double t) {
        double h = 0.00001; 
        return (f(t + h) - f(t)) / h; 
    }

    public static void main(String[] args) {
        System.out.println("Amir Hossein Dezghi");
        System.out.println("Tangent behavier from t = -4 to 4:");
        System.out.println("---------------------------------------");

        System.out.printf("%-5s | %-12s | %-10s\n", "t", "Point (x,y)", "Slope (m)");
        System.out.println("---------------------------------------");

        for (double t = -4; t <= 4; t++) {
            double y = f(t);
            double m = Slope(t);
            System.out.printf("%-5.1f | (%.1f, %.1f) | %.2f\n", t, t, y, m);
        }
    }
}