package builder;

import model.PersonDto;

public class PersonBuilder {
    private String name;
    private int korean;
    private int math;
    private int english;
    private int science;

    public PersonBuilder name(String name){
        this.name = name;
        return this;
    }
    public PersonBuilder korean(int korean){
        this.korean = korean;
        return this;
    }public PersonBuilder math(int math){
        this.math = math;
        return this;
    }
    public PersonBuilder english(int english){
        this.english = english;
        return this;
    }public PersonBuilder science(int science){
        this.science = science;
        return this;
    }
    public PersonDto build(){
        return new PersonDto(name, korean, math, english, science);

    }

}
