package com.skillKeys;
//// using super keyword'
class A1 {
    int i,j ;
    A1(int i){
        this.i=i;
    }
    A1(){
        i=40 ; j=30 ;
    }
    void showVar(){
        System.out.printf("\tvariable i is %d and\n\t variable j is %d",i,j);
    }
}
class B2 extends A1 {
    int j;
    B2(){
        super(90);
        j=10 ;
    }
    void showVar() {
        //showVar();// recursive call
        super.showVar();
        // calling method of superclass by super keyword
        System.out.printf("\n\tVariable j is %d",j); // using super keyword to print 30
    }
}
class Demosuper
{
    public static void main(String[] args) {
        B2 ob = new B2();
        ob.showVar();;
        //ob.display();
    }
}

