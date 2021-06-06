package sef.Final_Activity.Activity_Two;

public class SecondActivity {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            try {
                return a / b;
            }
            catch(ArithmeticException arrEx) {
                System.out.println("An arithmetic exception occurred. Detail: " + arrEx.getLocalizedMessage());
                System.out.println("Division by Zero is not allowed!");
                return 0;
            }
        }
    }

