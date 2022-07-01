package com.practice;

public class OperatorsDemo {
    /*
     *Arithmetic --> (+, -, * , /, %)
     * Logical  --> (&&, ||, !)
     * Bitwise --> (&, |, <<, >>)
     * Relational -->(=, >, <, >=, <=)
     */
    public static void main(String[] args) {
      int num1 = 76;
      int num2 = 40;

      int sum = num1 + num2;
      int diff = num1 - num2;
      int product = num1 * num2;
      double quotient = (double)num1 / num2;
      int remainder = num1 % num2;


      //shorthand operators
        int num = 9;
        int total = 10;
        total+=num; // total = total + num;
        num++;   // num = num + 1 or  num+=1;


        System.out.println("Sum = "+ sum);
        System.out.println("Difference = "+ diff);
        System.out.println("Product = "+ product);
        System.out.println("Quotient = "+ quotient);
        System.out.println("Remainder = "+ remainder);
        System.out.println("Total = " + total);
        System.out.println("Num = " + num);

    }
}
