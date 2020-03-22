package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String result = "";
        StringBuffer stringBuffer = new StringBuffer(str);
        char ch = Character.toUpperCase(stringBuffer.charAt(str.length()/2));
        stringBuffer.setCharAt(str.length()/2, ch);
        result += stringBuffer;
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String result = "";
        StringBuffer stringBuffer = new StringBuffer(str);
        char ch = Character.toLowerCase(stringBuffer.charAt(str.length()/2));
        stringBuffer.setCharAt(str.length()/2, ch);
        result += stringBuffer;
        return result;
    }

    public static Boolean isIsogram(String str) {
        String[] ary = str.split("");
        Set<String> mySet = new HashSet<>(Arrays.asList(ary));

        if (str.length() == mySet.size()){
            return true;
        }
       else return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)){
                i++;
            }
            else result += str.charAt(i);
        }
        return result;
    }

    public static String invertCasing(String str) {
        String result = "";
        char toUpper;
        char toLower;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 91 & str.charAt(i) > 64){
                toLower = Character.toLowerCase(str.charAt(i));
                result += toLower;
            }
            if (str.charAt(i) < 123 & str.charAt(i) > 96){
                toUpper = Character.toUpperCase(str.charAt(i));
                result += toUpper;
            }
            if (str.charAt(i) > 31 & str.charAt(i) < 65 || str.charAt(i) == 94){
                result += str.charAt(i);
            }
        }
        return result;
    }
}