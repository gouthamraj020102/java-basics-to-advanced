package com.javaconcepts.operators.bitwiseoperators;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        // Bitwise AND
        System.out.println(a & b);

        // Bitwise OR
        System.out.println(a | b);

        // Bitwise XOR
        System.out.println(a ^ b);

        // Bitwise NOT, bitwise complement of any integer n is -(n + 1)
        System.out.println(~a);

        // Terms to remember:
        // Most Significant Bit (MSB) and Least Significant Bit (LSB)
        // MSB is the leftmost bit in a binary representation of a number
        // LSB is the rightmost bit in a binary representation of a number
        // MSB is signed bit i.e., 0 for positive numbers and 1 for negative numbers
        // 1st Complement of a number is obtained by inverting all bits of the number. Ex: 1st complement of 5 (0101) is 1010
        // 2nd Complement of a number is obtained by taking the 1st complement and adding 1 to it. Ex: 2nd complement of 1010 is = 1010 + 1 = 1011
    }
}
