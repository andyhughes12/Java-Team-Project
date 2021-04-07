
package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DatabaseTest {

    private Admin ad1;
    private Database d1,d2;

    @BeforeEach
    void init() {
        ad1 = new Admin("John", "gxf5000", 1123456789);
        d1 = new Database("Joe","1234567890","432111111111",4500.00);
        d2 = new Database("Bill","1234567891","432111111112",5000.00);

    }


//Fails
    @Test
    void testAdminUserName() {

        ArrayList AdminNames = new ArrayList();
        AdminNames.add(ad1.getUsername());

        assertEquals(false, AdminNames.contains("Paul"));
    }
    @Test
    void testEmployeeNum(){
        ArrayList EmployeeNum = new ArrayList();
        EmployeeNum.add(ad1.getEmployeeNum());

        assertEquals(false, EmployeeNum.contains(1123456));

    }
    @Test
    void testClientName() {
        ArrayList ClientNames = new ArrayList();
        ClientNames.add(d1.getName());
        ClientNames.add(d2.getName());

        assertEquals(false, ClientNames.contains("tom"));

    }
    @Test
    void testClientID() {
        ArrayList ClientID = new ArrayList();
        ClientID.add(d1.getId());
        ClientID.add(d2.getId());

        assertEquals(false, ClientID.contains("123456"));

    }
    @Test
    void testClientPhone() {
        ArrayList ClientPhone = new ArrayList();
        ClientPhone.add(d1.getPhone());
        ClientPhone.add(d2.getPhone());

        assertEquals(false, ClientPhone.contains("123456"));

    }










}
