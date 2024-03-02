package algorithm;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 1등의 학생의 이름과 점수는 무엇입니까?");
        System.out.println("응시한 학생 수: ");
        int students = sc.nextInt();
        int[] scores = new int[students];
        String[] names = new String[students];

        System.out.println("입력된 점수 중 1등의 이름과 점수를 구하시오.");
        int max = 0;
        int maxCount = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("점수 입력: ");
            scores[i] = sc.nextInt();
            System.out.println("이름 입력: ");
            names[i] = sc.next();
            if (max < scores[i]) {
                max = scores[i];
                maxCount = i;
            }
        }
        System.out.println("1등의 이름은 " + names[maxCount] + " 점수는 " + max + "입니다.");






    }
}