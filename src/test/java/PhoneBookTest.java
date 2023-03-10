import org.example.PhoneBook;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        phoneBook.add("29926574", "Petya");
        String expected = "Petya";

        String result = phoneBook.findByNumber("29926574");

        assertEquals(expected, result);
    }

    @Test
    public void findByNumberTestFalse() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("29926574", "Petya");
        String expected = "Hello";

        String result = phoneBook.findByNumber("29926574");

        assertNotEquals(expected, result);
    }

    @Test
    public void findByNameTestTrue() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("29926574", "Petya");
        String expected = "29926574";

        String result = phoneBook.findByName("Petya");

        assertEquals(expected, result);
    }

    @Test
    public void findByNameTestFalse() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("29926574", "Petya");
        String expected = "56584256";

        String result = phoneBook.findByName("Petya");

        assertNotEquals(expected, result);
    }

    @Test
    public void printAllNamesTrue() {
        PhoneBook phoneBook = Mockito.mock(PhoneBook.class);

        Mockito.doCallRealMethod().when(phoneBook).printAllNames();

        phoneBook.printAllNames();

        Mockito.verify(phoneBook, Mockito.times(1)).printAllNames();
    }

    @Test
    public void printAllNamesNever() {
        PhoneBook phoneBook = Mockito.mock(PhoneBook.class);
        Mockito.doCallRealMethod().when(phoneBook).printAllNames();

        Mockito.verify(phoneBook, Mockito.never()).printAllNames();
    }
}
