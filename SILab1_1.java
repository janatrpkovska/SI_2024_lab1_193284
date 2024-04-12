import java.util.ArrayList;
import java.util.List;

public class SILab1_1 {
    public static List<String> filterOddLengthStrings(List<String> list) {
        List<String> result = new гит ArrayList<>();
        for (String el : list) {
            if (el.length() % 2 != 0) {
                result.add(el);
            }
        }
        return result;
    }


}