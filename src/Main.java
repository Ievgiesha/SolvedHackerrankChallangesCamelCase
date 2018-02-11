import java.lang.reflect.Array;
import java.util.ArrayList;


 //* Created by Ievgenia on 10.02.2018.

 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Main{

 static int camelcase(String s) {
 char[] chars = s.toCharArray();
 int result = 1;
 for(int i = 0; i < chars.length; i++) {// Complete this function

 if(Character.isUpperCase(chars[i])== true){
     result++;
 }
 }return result;
 }

 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 String s = in.next();
 int result = camelcase(s);
 System.out.println(result);
 in.close();
 }
 }

