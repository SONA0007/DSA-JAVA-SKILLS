package com.skillKeys;
class MyAccessClass {
    public  String s1 = "Sonal";
     static int integer = 5;
    protected  float digit = 10.05f;

    public MyAccessClass(String s1) {
        this.s1 = s1;
    }

    public static void main(String[] args) {
        System.out.println(integer);
    }
}
class AccesIt{
    public static void main(String[] args) {
        MyAccessClass ob= new MyAccessClass("didi");
        MyAccessClass ob1= new MyAccessClass("neha");

        System.out.println(ob.digit);
        System.out.println(ob.s1);
        System.out.println(ob.integer);
        System.out.println(ob1.integer);
        }
}

