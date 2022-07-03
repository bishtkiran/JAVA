package com.practice;

public class JaggedArray {
    public static void main(String[] args) {
        int [][] jaggedArray = {
                {1,4,6,8,3},
                {2,5,7},
                {9,12,17,20},
                {11,15}
        };

        for(int i=0;i< jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(" "+jaggedArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("=======================");
        for(int [] oneDimensionalArray : jaggedArray){
            for(int element : oneDimensionalArray){
                System.out.print(" "+element);
            }
            System.out.println();
        }
    }
}
