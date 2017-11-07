package com.programmingChallanges.chall000;

import java.util.Scanner;

public class ControlPanel {

    static double result;

    public static void control() {
        ControlPanelDrawer controlPanelDrawer = new ControlPanelDrawer();
        ControlPanelDrawer.drawControlPanel();

        Scanner in = new Scanner(System.in);

        int inputUnit = in.nextInt();

        switch (inputUnit) {
            case 1:
                WeightConverter weightConverter = new WeightConverter();
                ControlPanelDrawer.drawFirstWeightControlPanel();
                inputUnit = in.nextInt();

                ControlPanelDrawer.drawSecondWeightControlPanel();
                int outputUnit = in.nextInt();

                ControlPanelDrawer.askForValue();
                double value = in.nextDouble();

                switch (inputUnit) {
                    case 1:
                        convertGrams(weightConverter, outputUnit, value);
                        break;
                    case 2:
                        convertDecagrams(weightConverter, outputUnit, value);
                        break;
                    case 3:
                        convertKilograms(weightConverter, outputUnit, value);
                        break;
                    case 4:
                        convertPounds(weightConverter, outputUnit, value);
                        break;
                    case 5:
                        convertOunces(weightConverter, outputUnit, value);
                        break;
                    case 6:
                        convertCarats(weightConverter, outputUnit, value);
                        break;
                    case 7:
                        convertGrains(weightConverter, outputUnit, value);
                        break;
                    case 8:
                        convertHundredweightUS(weightConverter, outputUnit, value);
                        break;
                    case 9:
                        convertHundredweightUK(weightConverter, outputUnit, value);
                        break;
                    case 10:
                        convertTones(weightConverter, outputUnit, value);
                        break;
                }
            case 2:
                System.exit(0);
        }

        ControlPanelDrawer.printResult(getResult());
    }

    private static void convertDecagrams(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.decagramsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.decagramsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.decagramsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.decagramsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.decagramsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.decagramsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.decagramsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.decagramsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.decagramsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.decagramsToTones(value));
                break;
        }
    }

    private static void convertGrams(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.gramsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.gramsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.gramsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.gramsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.gramsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.gramsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.gramsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.gramsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.gramsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.gramsToTones(value));
                break;
        }
    }

    private static void convertKilograms(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.kilogramsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.kilogramsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.kilogramsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.kilogramsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.kilogramsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.kilogramsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.kilogramsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.kilogramsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.kilogramsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.kilogramsToTones(value));
                break;
        }
    }

    private static void convertPounds(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.poundsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.poundsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.poundsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.poundsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.poundsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.poundsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.poundsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.poundsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.poundsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.poundsToTones(value));
                break;
        }
    }

    private static void convertOunces(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.ouncesToGrams(value));
                break;
            case 2:
                setResult(weightConverter.ouncesToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.ouncesToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.ouncesToPounds(value));
                break;
            case 5:
                setResult(weightConverter.ouncesToOunces(value));
                break;
            case 6:
                setResult(weightConverter.ouncesToCarats(value));
                break;
            case 7:
                setResult(weightConverter.ouncesToGrain(value));
                break;
            case 8:
                setResult(weightConverter.ouncesToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.ouncesToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.ouncesToTones(value));
                break;
        }
    }

    private static void convertCarats(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.caratsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.caratsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.caratsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.caratsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.caratsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.caratsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.caratsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.caratsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.caratsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.caratsToTones(value));
                break;
        }
    }

    private static void convertGrains(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.grainsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.grainsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.grainsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.grainsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.grainsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.grainsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.grainsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.grainsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.grainsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.grainsToTones(value));
                break;
        }
    }

    private static void convertHundredweightUS(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.hundredweightUSToGrams(value));
                break;
            case 2:
                setResult(weightConverter.hundredweightUSToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.hundredweightUSToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.hundredweightUSToPounds(value));
                break;
            case 5:
                setResult(weightConverter.hundredweightUSToOunces(value));
                break;
            case 6:
                setResult(weightConverter.hundredweightUSToCarats(value));
                break;
            case 7:
                setResult(weightConverter.hundredweightUSToGrain(value));
                break;
            case 8:
                setResult(weightConverter.hundredweightUSTohundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.hundredweightUSToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.hundredweightUSToTones(value));
                break;
        }
    }

    private static void convertHundredweightUK(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.hundredweightUKToGrams(value));
                break;
            case 2:
                setResult(weightConverter.hundredweightUKToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.hundredweightUKToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.hundredweightUKToPounds(value));
                break;
            case 5:
                setResult(weightConverter.hundredweightUKToOunces(value));
                break;
            case 6:
                setResult(weightConverter.hundredweightUKToCarats(value));
                break;
            case 7:
                setResult(weightConverter.hundredweightUKToGrain(value));
                break;
            case 8:
                setResult(weightConverter.hundredweightUKToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.hundredweightUKToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.hundredweightUKToTones(value));
                break;
        }
    }

    private static void convertTones(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                setResult(weightConverter.tonsToGrams(value));
                break;
            case 2:
                setResult(weightConverter.tonsToDecagrams(value));
                break;
            case 3:
                setResult(weightConverter.tonsToKilograms(value));
                break;
            case 4:
                setResult(weightConverter.tonsToPounds(value));
                break;
            case 5:
                setResult(weightConverter.tonsToOunces(value));
                break;
            case 6:
                setResult(weightConverter.tonsToCarats(value));
                break;
            case 7:
                setResult(weightConverter.tonsToGrain(value));
                break;
            case 8:
                setResult(weightConverter.tonsToHundredweightUS(value));
                break;
            case 9:
                setResult(weightConverter.tonsToHundredweightUK(value));
                break;
            case 10:
                setResult(weightConverter.tonsToTons(value));
                break;
        }
    }

    public static double getResult() {
        return result;
    }

    public static void setResult(double theResult) {
        result = theResult;
    }
}
