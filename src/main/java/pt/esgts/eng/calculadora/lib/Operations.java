package pt.esgts.eng.calculadora.lib;

import java.util.List;

public class
Operations {

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
}
