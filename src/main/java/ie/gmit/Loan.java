/*

Andrew Hughes
Loan Class
Last updated - 9/04/21

* */
package ie.gmit;

public class Loan {
    private String type;
    private String rate;
    private double amount;
    private String length;

    public Loan(String type,String rate,double amount, String length) {
        setRate(rate);
        setType(type);
        setAmount(amount);
        setlength(length);

    }

    public String getRate() { return rate; }

    public String getType() { return type; }

    public double getAmount() { return amount; }

    public String getLenght() { return length; }


    public void setType(String type) {

        if( (type == "Personal") || (type == "Morgage")|| (type == "Student") )
        {
            this.type = type;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Type");
        }
    }
    public void setRate(String rate) {

        if( (rate == "1%") || (rate == "5%")|| (rate == "10%" ))
        {
            this.rate = rate;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Rate");
        }
    }

    public void setAmount(double amount) {

        if( amount > 0 )
        {
            this.amount = amount;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Amount");
        }
    }

    public void setlength(String length) {

        if ((length == "2 years") || (length == "5 years")|| (length == "20 years"))
        {
            this.length = length;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Length");
        }
    }

    @Override
    public String toString() {
        return "Loan{" +
                "type='" + type + '\'' +
                ", rate=" + rate +
                ", amount=" + amount +
                ", lenght='" + length + '\'' +
                '}';
    }

}

