//package sef.Final_Activity.Activity_Two;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import sef.Final_Activity.Activity_One.Employee;
//import static org.junit.Assert.assertEquals;
//
//public class EmployeeTest {
//
//        Employee employee = new Employee();
//
//        @Before
//        public void setUp() throws Exception {
//            employee.setName("Eldar");
//            employee.setAge(24);
//            employee.setSalary(7000);
//            employee.setJobTitle("QA");
//            employee.setCompany("Accenture");
//        }
//
//        @After
//        public void tearDown() throws Exception {
//
//        }
//
//        @Test
//        public void testName() {
//            assertEquals("Eldar", employee.getName());
//        }
//
//
//        @Test
//        public void testAge() {
//            assertEquals(24, employee.getAge());
//        }
//
//        @Test
//        public void testSalary() {
//            assertEquals(7000.0, employee.getSalary(),0);
//        }
//
//        @Test
//        public void testJobTitle() {
//            assertEquals("QA", employee.getJobTitle());
//        }
//
//        @Test
//        public void testCompanyName() {
//            assertEquals("Accenture", employee.getCompany());
//        }
//
//        @Test
//        public void introductionTest() {
//            assertEquals("My name is %s and I am %d years old. I am working as %s in %s." + "\n" + employee.introducePerson());
//        }
//
//    }
//
