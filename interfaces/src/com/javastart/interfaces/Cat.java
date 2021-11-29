package com.javastart.interfaces;

public class Cat implements Animal {
    private String name;
    private int age;
    private String owner;
    public String getAnimalType() {
        return "Cat";
    }
    public void say (){
        System.out.println("Meow");

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
