import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PhoneBookTest {

    @Test
    public void addTestTrue() {
        PhoneBook phoneBook = new PhoneBook();

        boolean expected = true;

        boolean result = phoneBook.add("29926574", "Petya");
        System.out.println()
        ;
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
}
