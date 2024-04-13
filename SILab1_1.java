import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.Scanner;

public class SILab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
    }
=======

public class SILab1_1 {
    public static List<String> filterOddLengthStrings(List<String> list) {
        List<String> result = new git ArrayList<>();
        for (String el : list) {
            if (el.length() % 2 != 0) {
                result.add(el);
            }
        }
        return result;
    }


>>>>>>> 16e124a8551c0a2381abc5dc768ea641db6a2137
}