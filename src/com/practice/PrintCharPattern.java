package com.practice;

public class PrintCharPattern {
    /**
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     * A B C D E F
     */
    public static void main(String[] args) {
        for(int i =0; i<6; i++){
            for(int j =0; j<=i; j++){
                System.out.print((char)(j+65));
            }
            System.out.println();
        }
    }
}
