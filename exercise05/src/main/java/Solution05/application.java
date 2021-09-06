/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Eric Moore
 */
package Solution05;
/*
    This program requests the user to enter two numbers.
    The program then prints the numbers and the solution for
    addition, subtraction, multiplication, and division.
*/
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number?: ");
        int Int1 = in.nextInt();
        System.out.print("What is the second number?: ");
        int Int2 = in.nextInt();

        System.out.printf(Int1 + " + " + Int2 + " = ", Int1 + Int2);
        System.out.printf(Int1 + " - " + Int2 + " = ", Int1 - Int2);
        System.out.printf(Int1 + " * " + Int2 + " = ", Int1 * Int2);
        System.out.printf(Int1 + " / " + Int2 + " = ", Int1 / Int2);
        }
    }
