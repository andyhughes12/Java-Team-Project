package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdminTest {

    private Admin ad1;

    @BeforeEach
    void init() { ad1 = new Admin("Joe", "gxf5000", 1123456789); }

    @Test
    void testUsername() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Jo", "gxf5000", 1123456789) );
        assertEquals("Invalid username", e.getMessage());
    }

    @Test
    void testPassword() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf500", 1123456789) );
        assertEquals("Invalid password", e.getMessage());
    }

    @Test
    void testEmployeeNum() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf5000", 1234567) );
        assertEquals("Invalid Employee Number", e.getMessage());
    }
}
