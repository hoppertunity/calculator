package com.hopper.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @CalculatorTestpublic void testSum() {
    assertEquals(5, calculator.sum(2,3));
  }
}
