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
    void init() {
        a1 = new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00);
    }

    @Test
    void testTitle() {
        assertEquals("Mr", a1.getTitle());
    }

    @Test
    void testTitleFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Sir", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid title", e.getMessage());
    }

    @Test
    void testFullName() {
        assertEquals("Jack Sheridan", a1.getFullName());
    }

    @Test
    void testFullNameFail() {
        //Full name must contaoin a space between t wo words
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "JackSheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid full name", e.getMessage());
    }

    @Test
    void testFirstName() {
        assertEquals("Jack", a1.getFirstName());
    }

    @Test
    void testFirstNameFail() {
        //First name must be longer than 2
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Ja", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid first name", e.getMessage());
    }

    @Test
    void testLastName() {
        assertEquals("Sheridan", a1.getLastName());
    }

    @Test
    void testLastNameFail() {
        //Last name must be longer than 2
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sh", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid last name", e.getMessage());
    }

    @Test
    void testId() {
        assertEquals("1234567890", a1.getId());
    }

    @Test
    void testIdFail() {
        //Id should be greater than 9
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid id", e.getMessage());
    }

    @Test
    void testEircode() {
        assertEquals("H91R7YX", a1.getEircode());
    }

    @Test
    void testEircodeFail() {
        //Eircode must be valid
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "HRYX", "432111111111", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid eircode", e.getMessage());
    }

    @Test
    void testPhone() {
        assertEquals("432111111111", a1.getPhone());
    }

    @Test
    void testPhoneFail() {
        //Phone number must be longer than 10
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "12345", "G00@gmit.ie", 20, 5000.00) );
        assertEquals("Invalid phone", e.getMessage());
    }

    @Test
    void testEmail() {
        assertEquals("G00@gmit.ie", a1.getEmail());
    }

    @Test
    void testEmailFail() {
        //Email must contain an '@' symbol between two words
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00gmit.ie", 20, 5000.00) );
        assertEquals("Invalid email", e.getMessage());
    }

    @Test
    void testBalance() {
        assertEquals(5000.00, a1.getBalance());
    }

    @Test
    void testBalanceFail() {
        //Balance must be greater or equal to 0
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, -5000.00) );
        assertEquals("Invalid balance", e.getMessage());
    }

    @Test
    void testAge() {
        assertEquals(20, a1.getAge());
    }

    @Test
    void testAgeFail() {
        //Age must be greater than 16
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 15, 5000.00) );
        assertEquals("Invalid age", e.getMessage());
    }
}
