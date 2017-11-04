package com.programmingChallanges.chall000;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    while(true) {
	        startMenu();
        }
    }

    private static void startMenu() {
        drawMenu();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        switch (n) {
            case 1:
                //convertWeight();
                break;
            case 2:
                //convertArea();
                break;
            case 3:
                //convertLength();
                break;
            case 4:
                //convertVolume();
                break;
            case 5:
                //convertTime();
                break;
            case 6:
                System.exit(0);
        }
    }

    private static void drawMenu() {
        System.out.println("\nHello to unit converter. Which type of unit would you like to convert? Enter a number " +
                "to choose.\n" +
                "1. Weight\n" +
                "2. Area\n" +
                "3. Length\n" +
                "4. Volume\n" +
                "5. Time\n" +
                "6. I want to exit.");
    }
}
