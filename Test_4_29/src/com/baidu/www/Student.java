package com.baidu.www;

public class Student {

    private String name;
    private String gender;
    private int age;

    private static String classRoom = "404";
    /*public String name;
    public String gender;
    public int age;

    public static String classRoom = "404";*/

    public String doClassRoom() {
        return classRoom;
    }
    public static String getClassRoom() {
       // age += 1; error
       // System.out.println(this);/error

        return classRoom;
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
