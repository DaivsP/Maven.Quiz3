package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String firstHalf = str.substring(0,indexToCapitalize);
        String letterToCapitalize = str.substring(indexToCapitalize, indexToCapitalize + 1);
        String secondHalf = str.substring(indexToCapitalize + 1);
        return firstHalf + letterToCapitalize.toUpperCase() + secondHalf;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String  substring = baseString.substring(indexOfString, indexOfString + 1);
        String charCompare = characterToCheckFor.toString();
        if (substring.toUpperCase().equals(charCompare.toUpperCase())) {
            return true;
        }else {
            return false;
        }
    }

    public static String[] getAllSubStrings(String string) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                answer.add(string.substring(i, j));
            }
        }
        return answer.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
