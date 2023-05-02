package com.baidu.www;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.getClassRoom());

    }
    public static void main2(String[] args) {
       // System.out.println(Student.classRoom);


        Student s1 = new Student("张三", "男", 20);
        Student s2 = new Student("李四", "女", 19);
        Student s3 = new Student("王五", "男", 21);

       // System.out.println(s1.classRoom);
       // System.out.println(s2.classRoom);
       // System.out.println(s3.classRoom);

    }

    public static void main1(String[] args) {
        Phone iPone14 = new Phone("A16", "8G", "三星", "苹果");
        System.out.println(iPone14.brand);//default权限，只能在本包中访问。
        System.out.println(iPone14.screen);//public权限，项目中任何地方都可以访问。
        //System.out.println(iPone14.cpu);//private权限，只能在本类中使用。
        //System.out.println(iPone14.memory);//private权限，只能在本类中使用。
    }
}
