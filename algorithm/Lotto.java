package algorithm;

public class Lotto {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] lotto = new int[6];	// 로또 번호를 입력받을 배열을 선언해준다.

        for(int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 44) + 1;	// 1~46까지의 임의의 수를 받는다.
            lotto[i] = num;
            for(int j = 0; j < i; j++) {	// 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
            System.out.print(lotto[i] + " ");
        }

    }
}