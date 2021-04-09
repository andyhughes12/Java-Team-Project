package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoanTest {

    private Loan l1;

    @BeforeEach
    void init() {
        l1 = new Loan("Student",  "0%",500.00,"5 years");
    }
//Testing Type
    @Test
    void testType() {
        assertEquals("Student", l1.getType());
    }

    @Test
    void testTypeFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Loan("Personal","5%",500.00,"5 years") );
        assertEquals("Invalid Type", e.getMessage());
    }
//testing Rate
    @Test
    void testRate() { assertEquals("0%", l1.getRate()); }

    @Test
    void testRateFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Loan("Personal","2%",500.00,"5 years") );
        assertEquals("Invalid Rate", e.getMessage());
    }
    //testing Amount
    @Test
    void testAmount() {
        assertEquals(500.00, l1.getAmount());
    }

    @Test
    void testAmountFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Loan("Personal","5%",0,"5 years") );
        assertEquals("Invalid Amount", e.getMessage());
    }
    //testing Lenght
    @Test
    void testLength() {
        assertEquals("5 years", l1.getLenght());
    }

    @Test
    void testLengthFail() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Loan("Personal","5%",500.00,"50 years") );
        assertEquals("Invalid Length", e.getMessage());
    }
}
