package com.practice;

public class VariableNaming {
    public static void main(String[] args) {
        //Integer
        byte roll_num = 1;   // 1 byte = 8 bits --> -128 to 127
        short rol_num = 1;   // 2 byte = 16 bits --> -32768 to 32767
        int roll_number = 1; // 4 byte = 32 bits
        long roll_numb = 12349875l; // 8 byte = 64 bits

        //Character
        char alphabet = 'A';   // 2 bytes --> 16bits
        char number = 67;      //prints ASCII value

        double percent = 45; //implicit casting
        int marks = (int)78.9;  //explicit typecasting
        System.out.println("Byte Roll Number = "+ roll_num);
        System.out.println("Short Roll Number = "+ rol_num);
        System.out.println("Int Roll Number = "+ roll_number);
        System.out.println("Long Roll Number = "+ roll_numb);
        System.out.println("Character = "+ alphabet);
        System.out.println("Character = "+ number);
    }
}
