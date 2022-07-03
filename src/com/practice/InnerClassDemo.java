package com.practice;
class Outer{                     //Outer.class
    int code;
    Outer(){
        code = 10;
    }
    public void displayCode(){
        System.out.println("Class code for Outer Class = " + code);
    }
//    Member class
//    class Inner{                    //Outer$Inner.class
//        public void printMessage(){
//            System.out.println("Hello from Inner Class.");
//        }
//    }

    // Static inner class
    static class Inner{                    //Outer$Inner.class
        public void printMessage(){
            System.out.println("Hello from Inner Class.");
        }
    }
}
public class InnerClassDemo {            //InnerClassDemo.class (classfilename)
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.displayCode();

//        Outer.Inner inner = outer.new Inner();
        Outer.Inner inner = new Outer.Inner();
        inner.printMessage();
    }
}
