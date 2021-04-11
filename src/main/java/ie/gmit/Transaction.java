//Joey Fox
//G00361752
//Transaction class

package ie.gmit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private double amount;
    private String time;
    private boolean deposit;
    private boolean withdraw;

    // public double amount;

    //Transaction constructor
    public Transaction(double amount, boolean deposit, boolean withdraw){
        setTime();
        setDeposit(deposit);
        setWithdraw(withdraw);
        setAmount(amount);

    }

    public boolean isWithdraw() {
        return withdraw;
    }

    public void setWithdraw(boolean withdraw) {
        this.withdraw = withdraw;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public boolean isDeposit() {
        return deposit;
    }

    public void setDeposit(boolean deposit) {
        this.deposit = deposit;
    }

    //puts current time and date into time
    public void setTime(){

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.time = (formatter.format(date));
        //System.out.println(time);
    }

    public String getTime(){
        return time;
    }


}