package baekjoon;

import java.util.Scanner;

public class UpperLowerString2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for(int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            if(Character.isUpperCase(b)){
                result += Character.toLowerCase(b);
            } else{
                result += Character.toUpperCase(b);
            }
        }

        System.out.println(result);

    }
}
