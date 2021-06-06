package sef.Final_Activity.Activity_Two;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SecondActivityTest {
        public SecondActivity calculator = new SecondActivity();

    @Test
    public void addTest() {
        assertEquals(
                "Sum of two numbers is not correct",
                350,
                calculator.add(150, 200),
                0);
    }

    @Test
    public void subtractTest() {
        assertEquals(
                "Subtraction of two numbers is not correct",
                -8,
                calculator.subtract(2, 10),
                0);
    }

    @Test
    public void multiplyTest() {
        assertEquals(
                "Multiplication of two numbers is not correct",
                17.28,
                calculator.multiply(5.4, 3.2),
                0);
    }

    @Test
    public void divideTest() {
        assertEquals(
                "Division of two numbers is not correct",
                10,
                calculator.divide(40, 4),
                0);
    }
}

