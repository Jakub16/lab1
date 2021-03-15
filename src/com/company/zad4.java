package com.company;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {

        Scanner triangle = new Scanner(System.in);
        int a = triangle.nextInt();
        int b = triangle.nextInt();
        int c = triangle.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("BŁĄD");
        }
        else if (a+b>c && a+c>b && b+c>a ) {

            System.out.println("TAK");
        }
        else if (a+b <= c || a+c <=b || b+c<=a) {
            System.out.println("NIE");
        }


    }
}
