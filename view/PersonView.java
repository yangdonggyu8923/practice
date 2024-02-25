package view;

import builder.PersonBuilder;
import model.PersonDto;

import java.util.Scanner;

public class PersonView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름, 국어, 수학, 영어, 과학 점수를 입력하세요.");
        PersonDto person = new PersonBuilder()
                .name(sc.next())
                .korean(sc.nextInt())
                .math(sc.nextInt())
                .english(sc.nextInt())
                .science(sc.nextInt())
                .build();

        System.out.println(person.toString());
    }
}
