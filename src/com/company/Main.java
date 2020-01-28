package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();
        String monthNames;

        switch (days) {
            case 28: monthNames = "Feb";
            break;
            case 29: monthNames = "Feb";
            break;
            case 30: monthNames = "Apr, Jun, Sept, Nov";
            break;
            case 31: monthNames = "Jan, Mar, May, Jul, Aug, Oct, Dec";
            break;
            default : monthNames = "None apply.";
        }
        System.out.println(monthNames);
    }
}


/*
<28: null

28/29: Feb

30: Apr, Jun, Sept, Nov

31: Jan, Mar, May, Jul, Aug, Oct, Dec 31

 */