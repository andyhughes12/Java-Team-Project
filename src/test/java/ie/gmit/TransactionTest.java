package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TransactionTest {
    private Transaction t1;

    @BeforeEach
    void init() { t1 = new Transaction(50.00, true, true); }

    @Test
    void testTime(){
        String time = t1.getTime();
        System.out.println(time);
    }
    //deposit should fail and return error message
//    @Test
//    void testDepositFail() {
//        Exception e = assertThrows(IllegalArgumentException.class, () -> new Transaction(4.00, true, false) );
//        assertEquals("Deposit amount must be at least 5 Euro", e.getMessage());
//    }
//
    //withdrawal should fail and return error message
//    @Test
//    void testWithdrawFail() {
//        Exception e = assertThrows(IllegalArgumentException.class, () -> new Transaction(4.00, false, true) );
//        assertEquals("Withdrawal amount must be at least 5 Euro and may not exceed balance", e.getMessage());
//    }

    //tests deposit to see if it passes
    @Test
    void testDeposit() {
        //Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Sir", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals(true, t1.isDeposit());
    }

    //tests withdraw to see if it passes
    @Test
    void testWithdraw() {
        //Exception e = assertThrows(IllegalArgumentException.class, () -> new Client("Sir", "Jack", "1234567890","H91R7YX", "432111111111","G00@gmit.ie", 20, 5000.00) );
        assertEquals(true, t1.isWithdraw());
    }
}
