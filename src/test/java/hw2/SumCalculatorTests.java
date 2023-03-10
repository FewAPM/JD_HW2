package hw2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SumCalculatorTests {
    SumCalculator calculator;

        @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithOne() {
        //When
        int actual = calculator.sum(1);

        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithThree() {
        //When
        int actual = calculator.sum(3);

        //Then
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }

}
