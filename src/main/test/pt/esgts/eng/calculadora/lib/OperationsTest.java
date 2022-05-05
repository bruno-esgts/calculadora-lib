package pt.esgts.eng.calculadora.lib;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    public static Stream<Arguments> sumNumberProvider() {
        return Stream.of(
                Arguments.arguments(10,20,30),
                Arguments.arguments(11,11,22)
        );
    }

    @ParameterizedTest
    @MethodSource("sumNumberProvider")
    void testSum1(double val1, double val2, double expected) {
        double result = Operations.sum(val1,val2);
        assertEquals(expected, result);
    }

    @Test
    void testSum2() {
        double result = Operations.sum(List.of(11d,19d,10d));
        assertEquals(40, result);
    }
}