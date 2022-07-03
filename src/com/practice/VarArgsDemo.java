package com.practice;
class Calculate{
    public int calcuateSum(int ... elements){  //{4,7,9,3,1}
        int sum =0;
        for(int element : elements){
            sum+=element;
        }
        return sum;
    }
}
public class VarArgsDemo {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println("Sum = "+calculate.calcuateSum(4,7,9,3,1));
    }
}
