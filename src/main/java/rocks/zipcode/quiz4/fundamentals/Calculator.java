package rocks.zipcode.quiz4.fundamentals;


/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] arr = new Double[value.length];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Math.sqrt(value[i]);
        }
        return arr;
    }

    public static Double[] squares(Double... values) {
        Double[] arr = new Double[values.length];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = values[i] * values[i];
        }
        return arr;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        if (dividend != 0){
            return divisor / dividend;
        }
        else return -1.0;
    }
}
