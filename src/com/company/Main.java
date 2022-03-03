package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour  = sc.nextInt();
        System.out.print("Enter minute: ");
        int minute  = sc.nextInt();
        System.out.print("Enter second: ");
        int second  = sc.nextInt();

        int total  = (hour*3600) + (minute*60) + (second*1);
        System.out.println("Total " + total + " seconds");
    }
}
