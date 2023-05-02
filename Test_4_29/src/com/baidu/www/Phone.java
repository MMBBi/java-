package com.baidu.www;

public class Phone {
    private String cpu; //cpu
    private String memory;//内存
    public String screen;//屏幕
    String brand;//品牌 -什么都不加，默认default属性。

    public Phone(String cpu, String memory, String screen, String brand) {
        this.cpu = cpu;
        this.memory = memory;
        this.screen = screen;
        this.brand = brand;
    }

    public void callUp(){
        System.out.println("打电话");
    }

    public void sendOutNote() {
        System.out.println("发短信");
    }

    public void alarmClock() {
        System.out.println("定闹钟");
    }
}
