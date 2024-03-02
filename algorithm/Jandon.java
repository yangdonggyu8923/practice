package algorithm;

import java.util.Scanner;

public class Jandon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("물건 가격을 입력하세요");
        int price = sc.nextInt();
        int[] changes = {500, 100, 50, 10, 5, 1};
        int jandon = 1000 - price;
        int count = 0;

        for(int i=0; i<changes.length; i++) {
            count += jandon/changes[i];
            jandon = jandon%changes[i];
            System.out.println(i+1+"회 잔돈: "  + jandon);
            System.out.println("거스른 동전 개수 : " + count);
        }
        System.out.println("거스름돈 총 개수 : " + count);
    }
}
