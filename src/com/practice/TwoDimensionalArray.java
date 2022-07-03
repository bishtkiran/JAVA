package com.practice;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        for(int i =0; i< 4;i++){
            for(int j=0;j<5;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        System.out.println("=======================");
        for(int [] oneDimensionalArray : array){
            for(int element : oneDimensionalArray){
                System.out.print(" "+element);
            }
            System.out.println();
        }

    }
}
