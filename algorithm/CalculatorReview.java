package algorithm;

import java.util.Scanner;

public class CalculatorReview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자: ");
        int number1 = sc.nextInt();
        System.out.println("두 번째 숫자: ");
        int number2 = sc.nextInt();

        System.out.println("사칙연산 중 하나를 입력하세요.");
        String opcode = sc.next();
        int result = 0;
        if (opcode.equals("+")) {
            result = number1 + number2;
        } else if (opcode.equals("-")) {
            result = number1 - number2;
        } else if (opcode.equals("*")) {
            result = number1 * number2;
        } else if (opcode.equals("/")) {
            result = number1 / number2;
        } else {
            System.out.println("잘못된 연산 기호입니다.");
        }

        System.out.println("첫 번째 숫자 : " + number1);
        System.out.println("두 번째 숫자 : " + number2);
        System.out.println("결과 : " + result);
    }
}
