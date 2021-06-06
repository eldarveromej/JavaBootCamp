package sef.Final_Activity.Activity_One;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class PersonTest {
    @Test(expected =  PersonException.class)
    public void stringContainNumberExceptionIncorrectObjectTest() {
        Person person = new Person("A", 24);
        String name = person.getName();
    }

    @Test(expected =  PersonException.class)
    public void stringContainNumberExceptionIncorrectSetNameTest() {
        Person person = new Person("Eldar", 26);
        person.setName("A");
    }

    @Test()
    public void nameTest() {
        Person p = new Person();
        p.setName("Eldar");
        assertEquals("Eldar", p.getName());
    }

    @Test()
    public void nameSurname() {
        Person p = new Person();
        p.setSurname("Veromej");
        assertEquals("Veromej", p.getSurname());
    }

    @Test()
    public void nameAge() {
        Person p = new Person();
        p.setAge(30);
        assertEquals(30, p.getAge());
    }

    @Test
    public void introduceTest() {
        Person p = new Person();
        p.setAge(24);
        p.setName("Eldar");
        assertEquals("My name is Eldar and I am 24 years old", p.introducePerson());
    }
}
