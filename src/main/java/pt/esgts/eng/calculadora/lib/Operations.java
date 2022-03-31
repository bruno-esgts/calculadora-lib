package pt.esgts.eng.calculadora.lib;

import java.util.List;

public class Operations {

    public static double sum(double num1, double num2) {
        return sum(List.of(num1, num2));
    }

    public static double sum(List<Double> numbers) {
        int result = 0;

        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }

        return result;
    }

    public static double sub(double num1, double num2) {
        return sub(List.of(num1, num2));
    }

    public static double sub(List<Double> numbers) {
        Double result = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }

        return result;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }
}
