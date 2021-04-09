package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoanDBTest {

/////Student Loan Test
    //Rate
    @Test
    void testLoanRateS() {
        LoanDB l1 = new LoanDB();
       assertEquals(l1.getLoan("Student").getRate(),"1%");
    }
    //Amount
    @Test
    void testLoanAmountStudent() {
        LoanDB l1 = new LoanDB();
        assertEquals(l1.getLoan("Student").getAmount(),5.000);
    }
    //Length
    @Test
    void testLoanTypeStudent() {
        LoanDB l1 = new LoanDB();
        assertEquals(l1.getLoan("Student").getLenght(),"5 years");

    }
///Testing Personal Loan
    @Test
    void testLoanRatePersonal() {
        LoanDB l2 = new LoanDB();
        assertEquals(l2.getLoan("Personal").getRate(),"5%");
    }
    //Amount
    @Test
    void testLoanAmountPersonal() {
        LoanDB l2 = new LoanDB();
        assertEquals(l2.getLoan("Personal").getAmount(),10.000);
    }
    //Length
    @Test
    void testLoanTypePersonal() {
        LoanDB l2 = new LoanDB();
        assertEquals(l2.getLoan("Personal").getLenght(),"10 years");

    }
//Testing Mortgage Loan
    //Rate
    @Test
    void testLoanRateMortgage() {
        LoanDB l3 = new LoanDB();
        assertEquals(l3.getLoan("Mortgage").getRate(),"10%");
    }
    //Amount
    @Test
    void testLoanAmountMortgage() {
        LoanDB l3 = new LoanDB();
        assertEquals(l3.getLoan("Mortgage").getAmount(),500.000);
    }
    //Length
    @Test
    void testLoanTypeMortgage() {
        LoanDB l3 = new LoanDB();
        assertEquals(l3.getLoan("Mortgage").getLenght(),"25 years");

    }
}

