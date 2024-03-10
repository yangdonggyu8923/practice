import pipeline.UserView;
import view.AccountView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            switch (sc.next()){
                case "0":return;
                case "1":
                    AccountView.main(sc);break;
                case "2":
                    UserView.main(sc);break;
            }
        }


    }
}
