package com.company;

import java.util.Scanner;

public class Calculator {
    private int solution;
    private int x;
    private int y;
    private char operators;

    public Calculator()
    {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }

    public int addition(int x, int y)
    {
        return x + y;
    }
    public int subtraction(int x, int y)
    {
        return x - y;
    }
    public int multiplication(int x, int y)
    {
        return x * y;
    }
    public int division(int x, int y)
    {
        solution = x / y;
        return solution;
    }
    public static void main(String[] args) {

    }
}
