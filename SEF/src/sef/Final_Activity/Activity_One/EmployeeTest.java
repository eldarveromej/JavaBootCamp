//package sef.Final_Activity.Activity_One;
//
//import org.junit.Test;
//import sef.Final_Activity.Activity_One.PersonException;
//
//import static org.junit.Assert.assertEquals;
//
//public class EmployeeTest {
//    @Test(expected =  PersonException.class)
//    public void stringIncorrectObjectTest() {
//        Employee employee = new Employee("A","Veromej", 26);
//        String name = employee.getName();
//    }
//
//    @Test(expected =  PersonException.class)
//    public void stringIncorrectSetNameTest() {
//        Employee employee = new Employee("Eldar","Veromej", 26);
//        employee.setName("A");
//    }
//
//    @Test()
//    public void nameTest() {
//        Employee e = new Employee();
//        e.setName("Eldar");
//        assertEquals("Eldar", e.getName());
//    }
//
//    @Test()
//    public void nameSurname() {
//        Employee e = new Employee();
//        e.setSurname("Veromej");
//        assertEquals("Veromej", e.getSurname());
//    }
//
//    @Test()
//    public void nameAge() {
//        Employee e = new Employee();
//        e.setAge(24);
//        assertEquals(24, e.getAge());
//    }
//
//    @Test
//    public void introduceTest() {
//        Employee e = new Employee();
//        e.setAge(24);
//        e.setName("Eldar");
//        assertEquals("My name is Eldar and I am 24 years old", e.introducePerson());
//                                }
//}
//
