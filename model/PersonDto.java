package model;

public class PersonDto {
    private String name;
    private int korean;
    private int math;
    private int english;
    private int science;

    public PersonDto(String name, int korean, int math, int english, int science) {
        this.name = name;
        this.korean = korean;
        this.math = math;
        this.english = english;
        this.science = science;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return "성적표\n" +
                "이름 : " + name +
                "\n국어 : " + korean +
                "\n수학 : " + math +
                "\n영어 : " + english +
                "\n과학 : " + science;
    }
}
