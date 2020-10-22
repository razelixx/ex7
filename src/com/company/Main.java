package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan_number = new Scanner(System.in);
        int number = scan_number.nextInt();

        int x = 1;
        int y = 2;
        int z = 3;

        if (number == x || number == y || number == z){
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }

    }
}
