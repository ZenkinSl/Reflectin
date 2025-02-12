package org.example;

public class Dog{
    String name;
    int age;
    private String special;

    public void setSpecial(String special) {
        this.special = special;
    }

    public void bark(String voice){
        if (voice == null) voice = "vaf vaf";
        System.out.println(voice);
    }


    Dog(String name, int age, String special) {
        this.special = special;
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return name + " ," + age + " ," + special;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
