package com.example.blovvme.firstdaytest;

import java.util.ArrayList;

/**
 * Created by Blovvme on 8/1/2017.
 */

public class CodingTest {
    public static void main(String[] args) {

        //if number divisible by 3 then print "fizz"
        //if number is divisible by 5 print out "buzz"
        //if by both print out "Fizzbuzz"

        int num [] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //Problem 2
        //Print out the duplicate strings in a arraylist of strings
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");


    }

    public void printFizzBuzzz(ArrayList<Integer> num){
        for (int i = 0; i >= 15;i++){
            if  num [i] == 1
                    System.out.println("");
            else if num [i] == 2
                    System.out.println("");
            else if num [i] ==3
                    System.out.println("FIZZ");
            else if num [i] == 4
                    System.out.println("");
            else if num [i] == 5
                System.out.println("BUZZ");
            else if num [i] == 6
                System.out.println("FIZZ");
            else if num [i] == 7
                System.out.println("FIZZ");
            else if num [i] == 8
                System.out.println("FIZZ");
            else if num [i] == 9
                System.out.println("FIZZ");
            else if num [i] == 10
                System.out.println("BUZZ");
            else if num [i] == 11
                System.out.println("FIZZ");
            else if num [i] == 12
            System.out.println("FIZZ");
            else if num [i] == 13
            System.out.println("FIZZ");\
            else if num [i] == 14
            System.out.println("FIZZ");
            else if num [i] == 15
            System.out.println("BUZZ");






        }

    }
}
