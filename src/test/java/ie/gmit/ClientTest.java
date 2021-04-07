//  Jack Sheridan
//  G00326495
//  ClientAccountTest

package ie.gmit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClientTest extends Client {

    private Client a1;

    @BeforeEach
    void init() {
        a1 = new Client("Mr", "Jack", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00);
    }

    @Test
    void testTitle() {
        assertEquals("Mr", a1.getTitle());
    }

    @Test
    void testTitleFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Sir", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid title", e.getMessage());
    }

    @Test
    void testName() {
        assertEquals("Jack", a1.getName());
    }

    @Test
    void testNameFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Ja", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid name", e.getMessage());
    }

    @Test
    void testId() {
        assertEquals("1234567890", a1.getId());
    }

    @Test
    void testIdFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid id", e.getMessage());
    }

    @Test
    void testEircode() {
        assertEquals("H91R7YX", a1.getEircode());
    }

    @Test
    void testEircodeFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","HRYX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid eircode", e.getMessage());
    }

    @Test
    void testPhone() {
        assertEquals("432111111111", a1.getPhone());
    }

    @Test
    void testPhoneFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","H91R7YX", "4321","G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid phone", e.getMessage());
    }

    @Test
    void testEmail() {
        assertEquals("G00@gmit.ie", a1.getEmail());
    }

    @Test
    void testEmailFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890", "H91R7YX", "432111111111", "G00gmit.ie", 20, 5000.00) );
        assertEquals("Invalid email", e.getMessage());
    }

    @Test
    void testBalance() {
        assertEquals(5000.00, a1.getBalance());
    }

    @Test
    void testBalanceFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, -5000.00) );
        assertEquals("Invalid balance", e.getMessage());
    }

    @Test
    void testAge() {
        assertEquals(20, a1.getAge());
    }

    @Test
    void testAgeFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 15, 5000.00) );
        assertEquals("Invalid age", e.getMessage());
    }
}
