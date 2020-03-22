package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middle = values.length / 2;
        return values[middle];
    }

    public static String[] removeMiddleElement(String[] values) {
       int middle = values.length / 2;
        String[] newArr = new String[values.length - 1];
        for (int i = 0; i < newArr.length ; i++) {
            if (i < middle){
                newArr[i] = values[i];
            }
            if (i >= middle){
                newArr[i] = values[i+1];

            }
        }
        return newArr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] newArr = new String[values.length - 1];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = values[i];
        }
        return newArr;
    }
}