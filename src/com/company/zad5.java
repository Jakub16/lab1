package com.company;

import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesiąc:");
        int x = scanner.nextInt();

        if( x > 0 & x <= 12) {
            switch (x) {
                case 1 -> System.out.println("Styczeń: 31 dni");
                case 2 -> System.out.println("Luty: 28 dni");
                case 3 -> System.out.println("Marzec: 31 dni");
                case 4 -> System.out.println("Kwiecień: 30 dni");
                case 5 -> System.out.println("Maj: 31 dni");
                case 6 -> System.out.println("Czerwiec: 30 dni");
                case 7 -> System.out.println("Lipiec: 31 dni");
                case 8 -> System.out.println("Sierpień: 31 dni");
                case 9 -> System.out.println("Wrzesień: 30 dni");
                case 10 -> System.out.println("Październik: 31 dni");
                case 11 -> System.out.println("Listopad: 30 dni");
                case 12 -> System.out.println("Grudzień: 31 dni");
            }
        } else {
            System.out.println("BŁĄD");
        }
    }
}
