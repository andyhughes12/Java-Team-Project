//  Jack Sheridan
//  G00326495
//  ClientAccountTest

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClientTest {

    private Client a1;

    @BeforeEach
    void init() { a1 = new Client("Mr", "Jack", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00); }

    @Test
    void testTitle() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Sir", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid title", e.getMessage());
    }

    @Test
    void testName() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Ja", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid name", e.getMessage());
    }

    @Test
    void testId() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid id", e.getMessage());
    }

    @Test
    void testEircode() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","HRYX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid eircode", e.getMessage());
    }

    @Test
    void testPhone() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","H91R7YX", "4321","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid phone", e.getMessage());
    }

    @Test
    void testEmail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890", "H91R7YX", "432111111111", "G00gmit.ie", 20, 5000.00) );
        assertEquals("Invalid email", e.getMessage());
    }

    @Test
    void testBalance() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, -5000.00) );
        assertEquals("Invalid balance", e.getMessage());
    }

    @Test
    void testAge() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 15, 5000.00) );
        assertEquals("Invalid age", e.getMessage());
    }
}
