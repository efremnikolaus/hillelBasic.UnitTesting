package Arithmetic;

public class Array {
    public double arithmeticAverage(double[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (double i = 0; i < array.length; i++) {
            sum += array[(int) i];
        }
        return (sum / array.length);
    }
}
