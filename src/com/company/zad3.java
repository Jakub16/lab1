package com.company;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        String[] input = new String[2];
        String a, b;

        input = text.nextLine().split(" ");
        a= input[0];
        b= input[1];


        System.out.println('"' + "%" + b + " " + a + "%" + '"');
    }
}
