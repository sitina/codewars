package net.sitina;

public class GpsSpeed {

    public static int gps(int s, double[] x) {
        double max = 0;

        for (int i = 0; (x.length > 1) && (i < x.length - 1); i++) {
            double speed = getSpeed(x[i], x[i + 1], s);
            if (speed > max) max = speed;
        }

        return (int)Math.floor(max);
    }

    private static double getSpeed(double a, double b, int s) {
        return Math.abs(b - a) * ((60 / s) * 60);
    }

}
