package com.han95210.java.playground.gugudan;

public class Animal {
    String name; //객체 변수(=인스턴스 변수, 멤버변수, 속성)

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();
        cat.setName("boby");
        dog.setName("happy");
        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}