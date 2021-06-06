package sef.Final_Activity.Activity_One;
import sef.Final_Activity.Activity_One.Person;
public class PersonExceptionExample  {
        public static void main(String[] args) {
            try {
                Person candy = new Person("Antony41","Papa", 12);
                Person bike = new Person("Eldar", "Veromej96", 24);
                Person thunder = new Person("Nani","Peterson",38);
            }
            catch (Exception fired) {
                System.out.println("A custom exception occurred.");
                System.out.println("Exception detail: " + fired.getMessage());
            }


        }

    }

