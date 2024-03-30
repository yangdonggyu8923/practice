package com.james.api.user;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
    private String checkPassword;
    private String name;
    private String phone;
    private Long addressId;
    private String job;
    private double height;
    private double weight;
    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password, String checkPassword, String name, String phone, String job, double height, double weight) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.checkPassword = checkPassword;
        this.name = name;
        this.phone = phone;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

