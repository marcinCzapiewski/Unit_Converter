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
                        convertCarats(weightConverter, outputUnit , value);
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
                weightConverter.gramsToGrams(value);
                break;
            case 2:
                weightConverter.gramsToDecagrams(value);
                break;
            case 3:
                weightConverter.gramsToKilograms(value);
                break;
            case 4:
                weightConverter.gramsToPounds(value);
                break;
            case 5:
                weightConverter.gramsToOunces(value);
                break;
            case 6:
                weightConverter.gramsToCarats(value);
                break;
            case 7:
                weightConverter.gramsToGrain(value);
                break;
            case 8:
                weightConverter.gramsToHundredweightUS(value);
                break;
            case 9:
                weightConverter.gramsToHundredweightUK(value);
                break;
            case 10:
                weightConverter.gramsToTones(value);
                break;
        }
    }

    private static void convertKilograms(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.kilogramsToGrams(value);
                break;
            case 2:
                weightConverter.kilogramsToDecagrams(value);
                break;
            case 3:
                weightConverter.kilogramsToKilograms(value);
                break;
            case 4:
                weightConverter.kilogramsToPounds(value);
                break;
            case 5:
                weightConverter.kilogramsToOunces(value);
                break;
            case 6:
                weightConverter.kilogramsToCarats(value);
                break;
            case 7:
                weightConverter.kilogramsToGrain(value);
                break;
            case 8:
                weightConverter.kilogramsToHundredweightUS(value);
                break;
            case 9:
                weightConverter.kilogramsToHundredweightUK(value);
                break;
            case 10:
                weightConverter.kilogramsToTones(value);
                break;
        }
    }

    private static void convertPounds(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.poundsToGrams(value);
                break;
            case 2:
                weightConverter.poundsToDecagrams(value);
                break;
            case 3:
                weightConverter.poundsToKilograms(value);
                break;
            case 4:
                weightConverter.poundsToPounds(value);
                break;
            case 5:
                weightConverter.poundsToOunces(value);
                break;
            case 6:
                weightConverter.poundsToCarats(value);
                break;
            case 7:
                weightConverter.poundsToGrain(value);
                break;
            case 8:
                weightConverter.poundsToHundredweightUS(value);
                break;
            case 9:
                weightConverter.poundsToHundredweightUK(value);
                break;
            case 10:
                weightConverter.poundsToTones(value);
                break;
        }
    }

    private static void convertOunces(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.ouncesToGrams(value);
                break;
            case 2:
                weightConverter.ouncesToDecagrams(value);
                break;
            case 3:
                weightConverter.ouncesToKilograms(value);
                break;
            case 4:
                weightConverter.ouncesToPounds(value);
                break;
            case 5:
                weightConverter.ouncesToOunces(value);
                break;
            case 6:
                weightConverter.ouncesToCarats(value);
                break;
            case 7:
                weightConverter.ouncesToGrain(value);
                break;
            case 8:
                weightConverter.ouncesToHundredweightUS(value);
                break;
            case 9:
                weightConverter.ouncesToHundredweightUK(value);
                break;
            case 10:
                weightConverter.ouncesToTones(value);
                break;
        }
    }

    private static void convertCarats(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.caratsToGrams(value);
                break;
            case 2:
                weightConverter.caratsToDecagrams(value);
                break;
            case 3:
                weightConverter.caratsToKilograms(value);
                break;
            case 4:
                weightConverter.caratsToPounds(value);
                break;
            case 5:
                weightConverter.caratsToOunces(value);
                break;
            case 6:
                weightConverter.caratsToCarats(value);
                break;
            case 7:
                weightConverter.caratsToGrain(value);
                break;
            case 8:
                weightConverter.caratsToHundredweightUS(value);
                break;
            case 9:
                weightConverter.caratsToHundredweightUK(value);
                break;
            case 10:
                weightConverter.caratsToTones(value);
                break;
        }
    }

    private static void convertGrains(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.grainsToGrams(value);
                break;
            case 2:
                weightConverter.grainsToDecagrams(value);
                break;
            case 3:
                weightConverter.grainsToKilograms(value);
                break;
            case 4:
                weightConverter.grainsToPounds(value);
                break;
            case 5:
                weightConverter.grainsToOunces(value);
                break;
            case 6:
                weightConverter.grainsToCarats(value);
                break;
            case 7:
                weightConverter.grainsToGrain(value);
                break;
            case 8:
                weightConverter.grainsToHundredweightUS(value);
                break;
            case 9:
                weightConverter.grainsToHundredweightUK(value);
                break;
            case 10:
                weightConverter.grainsToTones(value);
                break;
        }
    }

    private static void convertHundredweightUS(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.hundredweightUSToGrams(value);
                break;
            case 2:
                weightConverter.hundredweightUSToDecagrams(value);
                break;
            case 3:
                weightConverter.hundredweightUSToKilograms(value);
                break;
            case 4:
                weightConverter.hundredweightUSToPounds(value);
                break;
            case 5:
                weightConverter.hundredweightUSToOunces(value);
                break;
            case 6:
                weightConverter.hundredweightUSToCarats(value);
                break;
            case 7:
                weightConverter.hundredweightUSToGrain(value);
                break;
            case 8:
                weightConverter.hundredweightUSTohundredweightUS(value);
                break;
            case 9:
                weightConverter.hundredweightUSToHundredweightUK(value);
                break;
            case 10:
                weightConverter.hundredweightUSToTones(value);
                break;
        }
    }

    private static void convertHundredweightUK(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.hundredweightUKToGrams(value);
                break;
            case 2:
                weightConverter.hundredweightUKToDecagrams(value);
                break;
            case 3:
                weightConverter.hundredweightUKToKilograms(value);
                break;
            case 4:
                weightConverter.hundredweightUKToPounds(value);
                break;
            case 5:
                weightConverter.hundredweightUKToOunces(value);
                break;
            case 6:
                weightConverter.hundredweightUKToCarats(value);
                break;
            case 7:
                weightConverter.hundredweightUKToGrain(value);
                break;
            case 8:
                weightConverter.hundredweightUKToHundredweightUS(value);
                break;
            case 9:
                weightConverter.hundredweightUKToHundredweightUK(value);
                break;
            case 10:
                weightConverter.hundredweightUKToTones(value);
                break;
        }
    }

    private static void convertTones(WeightConverter weightConverter, int m, double value) {
        switch (m) {
            case 1:
                weightConverter.tonsToGrams(value);
                break;
            case 2:
                weightConverter.tonsToDecagrams(value);
                break;
            case 3:
                weightConverter.tonsToKilograms(value);
                break;
            case 4:
                weightConverter.tonsToPounds(value);
                break;
            case 5:
                weightConverter.tonsToOunces(value);
                break;
            case 6:
                weightConverter.tonsToCarats(value);
                break;
            case 7:
                weightConverter.tonsToGrain(value);
                break;
            case 8:
                weightConverter.tonsToHundredweightUS(value);
                break;
            case 9:
                weightConverter.tonsToHundredweightUK(value);
                break;
            case 10:
                weightConverter.tonsToTons(value);
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
