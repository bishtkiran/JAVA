package com.practice;

class Calculation{
    int number1;
    int number2;
    int result;

    Calculation(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    Calculation(double number1, double number2){
        this.number1 = (int)number1;
        this.number2 = (int)number2;
    }

    public void performProduct(){
        result = number1 * number2;
    }

    public void performProduct(int number1, int number2){
        result = number1 * number2;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Calculation calculation = new Calculation(15, 20);
        calculation.performProduct();
        System.out.println("Product = "+ calculation.result);
        calculation.performProduct(6,9);
        System.out.println("Overloading = " + calculation.result);

        Calculation calculation1 = new Calculation(12.5, 10.2);
        calculation1.performProduct();
        System.out.println("Product = "+ calculation1.result);



    }
}
