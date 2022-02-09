package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner appScanner =new Scanner(System.in);
        int i=0;
        while(i==0) {
            System.out.println("Options: [1] Display all contacts - [2] Add Contact - [3] Update Contact - [4] Remove contact - [5] Search contact - [6] Close app");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("What would you like to do?");
            int n = Integer.parseInt(appScanner.nextLine());
            if (n == 1) {


            }if (n == 2) {

            }if (n == 3) {

            }if (n == 4) {

            }if (n == 5) {

            }if (n == 6) {
                System.exit(0);

            }

        }
    }
}
