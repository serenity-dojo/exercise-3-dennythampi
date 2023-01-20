package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteFood;
    private int age;

    public Dog(String name, String favoriteFood, int age) {
        this.name=name;
        this.favoriteFood=favoriteFood;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }
}
