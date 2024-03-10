package pipeline;

import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController controller = new UserController();
        while(true){
            switch (sc.next()){
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("?");
                    controller.findUsers();
                    break;
            }
        }
    }
}
