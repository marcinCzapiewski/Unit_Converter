package com.programmingChallanges.chall000;

class ControlPanelDrawer {

    static void drawControlPanel() {
        System.out.println("\nHello to unit converter. Which type of unit would you like to convert? Enter a number " +
                "to choose.\n" +
                "1. Weight\n" +
                "2. I want to exit.");
    }

    static void drawFirstWeightControlPanel() {
        System.out.println("\nWhat's your input unit?\n" +
                "1. Grams\n" +
                "2. Decagrams\n" +
                "3. Kilograms\n" +
                "4. Pounds\n" +
                "5. Ounces\n" +
                "6. Carats\n" +
                "7. Grains\n" +
                "8. Hundredweights US\n" +
                "9. Hundredweights UK\n" +
                "10. Tons\n");
    }

    static void drawSecondWeightControlPanel() {
        System.out.println("\nWhat's your output unit?\n" +
                "1. Grams\n" +
                "2. Decagrams\n" +
                "3. Kilograms\n" +
                "4. Pounds\n" +
                "5. Ounces\n" +
                "6. Carats\n" +
                "7. Grains\n" +
                "8. Hundredweights US\n" +
                "9. Hundredweights UK\n" +
                "10. Tons\n");
    }

    static void askForValue() {
        System.out.println("Enter the value to convert: ");
    }

    static void printResult(double result) {
        System.out.println("\nResult: " + result);
    }
}
