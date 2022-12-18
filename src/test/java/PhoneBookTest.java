import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class PhoneBookTest {

    @Test
    public void addTestTrue() {
        PhoneBook phoneBook = new PhoneBook();

        boolean expected = true;

        boolean result = phoneBook.add("29926574", "Petya");
        System.out.println();

        assertEquals(expected, result);
    }

    @Test
    public void addTestFalse() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("29926574", "Petya");

        boolean expected = false;

        boolean result = phoneBook.add("29926574", "Petya");
        System.out.println();

        assertEquals(expected, result);
    }

    @Test
    public void findByNumberTestTrue() {
        PhoneBook phoneBook = new PhoneBook();
        String expected = null;

        String result = phoneBook.findByNumber();

        assertEquals(expected, result);
    }

    @Test
    public void findByNumberTestFalse() {
        PhoneBook phoneBook = new PhoneBook();
        String expected = "Hello";

        String result = phoneBook.findByNumber();

        assertNotEquals(expected, result);
    }
}
