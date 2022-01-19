package com.kiukyu;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    public void printStudent() {
        System.out.println(this.name + " " + this.classes);
    }
}
