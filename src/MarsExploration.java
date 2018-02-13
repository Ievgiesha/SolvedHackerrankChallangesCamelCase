import java.util.Scanner;

/**
 * Created by Ievgenia on 12.02.2018.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    static int marsExploration(String s) {
        int result = 0;
        int words = (s.length() / 3);
        String sos = "SOS";
        String temp = "SOS";
        for (int i = 1; i < words; i++) {
            temp += sos;
        }
        char[] charTemp = temp.toCharArray();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == charTemp[i]) {
                continue;
            } else {
                result++;
            }
        }
        return result;                           // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
