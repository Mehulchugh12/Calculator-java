package com.calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  char operator;
      double num1,num2;
      Scanner input = new Scanner(System.in);

        System.out.println("ENTER THE OPERATOR ( +,-,*,/ )");
        operator = input.next().charAt(0);

        System.out.println("ENTER YOUR PROBLEM");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        input.close();

         switch( operator ) {
             case '+':
                 System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
                 break;
             case '-':
                 System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
                 break;
             case '*':
                 System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
                 break;
             case '/':
                 if( num2 != 0 );
                 System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2));
                 if( num2 != 0 );
                 System.out.println("DIVIDE BY ZERO SITUATION");
                 break;







         }
}}
