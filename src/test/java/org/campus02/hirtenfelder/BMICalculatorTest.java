package org.campus02.hirtenfelder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        this.bmiCalculator = new BMICalculator(180, 1.8);
    }

    @Test
    void testConstructor() {
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8, bmiCalculator.getHeightInMeters());
    }

    @Test
    void result() {
    }
}