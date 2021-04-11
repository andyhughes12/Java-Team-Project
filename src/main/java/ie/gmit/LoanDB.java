/*

Andrew Hughes
LoanDB Class
Last updated - 9/04/21

* */
package ie.gmit;

public class LoanDB {

    public static Loan getLoan(String LoanType) {

        Loan l2 = new Loan();
        if (LoanType.equalsIgnoreCase("Student")) {
            l2.setType(LoanType);
            l2.setRate("1%");
            l2.setAmount(5.000);
            l2.setlength("5 years");
        } else if (LoanType.equalsIgnoreCase("Personal")) {
            l2.setType(LoanType);
            l2.setRate("5%");
            l2.setAmount(10.000);
            l2.setlength("10 years");
        } else if (LoanType.equalsIgnoreCase("Mortgage")) {
            l2.setType(LoanType);
            l2.setRate("10%");
            l2.setAmount(500.000);
            l2.setlength("25 years");
        } else {
            throw new IllegalArgumentException("Invalid LoanType");
        }

        return l2;

    }
}
