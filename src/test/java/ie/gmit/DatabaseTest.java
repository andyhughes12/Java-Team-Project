
package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DatabaseTest {

    private Admin ad1;
    private Database d1;

    @BeforeEach
    void init() {
        ad1 = new Admin("Joe", "gxf5000", 1123456789);
        d1 = new Database(1);
    }



    @Test
    void testUsername() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Admin("Jo", "gxf5000", 1123456789) );
        assertEquals("Invalid username", e.getMessage());
    }

    @Test
    void testDataBase() {
        ArrayList ClientNames = new ArrayList();
        ClientNames.add("John");

        ClientNames.contains("John");
    }







}
