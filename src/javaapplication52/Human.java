/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication52;

/**
 * @author LAND
 */
public class Human {
    private String name;
    private int age;
    private String order;

    public Human() {
        setname();
        setage();
        setorder();
    }

    public void setname() {
        String namearr[] = {"枸杞", "枸杞原汁", "枸杞葡萄汁", "枸杞不好喝", "枸杞大帥哥", "枸杞好喝", "枸杞西瓜汁"};
        int arrlength = namearr.length;
        int randnumber = (int) (Math.random() * arrlength);
        String name = namearr[randnumber];
        this.name = name;
    }

    public void setage() {
        int age = (int) (Math.random() * (90 - 18 + 1) + 18);
        this.age = age;
    }

    public void setorder() {
        String orderarr[] = {"牛排", "豬排", "羊肉排", "陽春乾麵", "牛肉湯麵", "烤玉米", "蘿蔔糕"};
        int arrlength = orderarr.length;
        int randnumber = (int) (Math.random() * arrlength);
        String order = orderarr[randnumber];
        this.order = order;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public String getorder() {
        return order;
    }

    @Override
    public String toString() {
        return "姓名:" + name + " 年齡:" + age + " 餐點:" + order;
    }
}
