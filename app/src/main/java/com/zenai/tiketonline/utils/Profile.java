package com.zenai.tiketonline.utils;

public class Profile {
    private String name;
    private String bio;
    private String city;
    private int age;

    public Profile(String name, String bio, String city, int age) {
        this.name = name;
        this.bio = bio;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
