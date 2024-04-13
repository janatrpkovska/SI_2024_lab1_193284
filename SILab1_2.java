import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
<<<<<<< HEAD
            if (el.length() < minLength) {
=======
            if (el.length() >= minLength) {
>>>>>>> 16e124a8551c0a2381abc5dc768ea641db6a2137
                sb.append(el);
            }
        }
        return sb.toString();
    }
}