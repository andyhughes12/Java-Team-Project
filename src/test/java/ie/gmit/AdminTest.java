package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdminTest {

    private Admin ad1;

    //create admin object before each test..
    @BeforeEach
    void init() { ad1 = new Admin("Joe", "gxf5000", 1123456789); }

    //testing username pass
    @Test
    void testUsername() {
        // Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf5000", 1123456789) );
        assertEquals("Joe", ad1.getUsername());
    }

    //testing password pass
    @Test
    void testPassword() {
        //Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf5000", 1123456789) );
        assertEquals("gxf5000", ad1.getPassword());
    }

    //testing employee number pass
    @Test
    void testEmployeeNum() {
        //Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf5000", 1123456789) );
        assertEquals(1123456789, ad1.getEmployeeNum());
    }

    //testing username fail
    @Test
    void testUsernameFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Jo", "gxf5000", 1123456789) );
        assertEquals("Invalid username", e.getMessage());
    }

    //testing username fail
    @Test
    void testPasswordFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf500", 1123456789) );
        assertEquals("Invalid password", e.getMessage());
    }

    //testing employee number fail
    @Test
    void testEmployeeNumFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Joe", "gxf5000", 1234567) );
        assertEquals("Invalid Employee Number", e.getMessage());
    }
}
