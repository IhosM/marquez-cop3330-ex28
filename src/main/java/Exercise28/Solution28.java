/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise28;

import java.util.Scanner;
public class Solution28

{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int answer = 0;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            answer += scan.nextInt();
        }

        System.out.println("The answer is:  " + answer + ".");
    }
}