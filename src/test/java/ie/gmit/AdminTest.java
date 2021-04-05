package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdminTest {

    private Admin ad1;

    @BeforeEach
    void init() { ad1 = new Admin("Joe", "gx5000", 1234567); }

    @Test
    void testUsername() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Jo", "gx5000", 1234567) );
        assertEquals("Invalid username", e.getMessage());
    }
}
