package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dwarf = new int[9];
        int total = 0;
        for(int i=0; i<dwarf.length; i++){
            dwarf[i] = sc.nextInt();
            total += dwarf[i];
        }
        int fake1 = 0;
        int fake2 = 0;
        for(int i=0; i<dwarf.length-1; i++){
            for(int j=i+1; j<dwarf.length; j++){
                if(total-dwarf[i]-dwarf[j]==100){
                    fake1 = dwarf[i];
                    fake2 = dwarf[j];
                }
            }
        }
        Arrays.sort(dwarf);
        for (int i=0; i<dwarf.length; i++){
            if(fake1 != dwarf[i] && fake2 != dwarf[i]){
                System.out.println(dwarf[i]);
            }
        }
    }
}
