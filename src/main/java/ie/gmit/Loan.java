package ie.gmit;

public class Loan {
    private String type;
    private String rate;
    private double amount;
    private String lenght;

    public Loan(String type,String rate,double amount, String lenght) {
        setRate(rate);
        setType(type);
        setAmount(amount);
        setlentgh(lenght);

    }

    public String getRate() { return rate; }

    public String getType() { return type; }

    public double getAmount() { return amount; }

    public String getLenght() { return lenght; }


    public void setType(String type) {

        if( (type == "Personal") || (type == "Morgage")|| (type == "student") )
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

    public void setlentgh(String lenght) {

        if ((lenght == "2 years") || (lenght == "5 years")|| (lenght == "20 years"))
        {
            this.lenght = lenght;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Lenght");
        }
    }

    @Override
    public String toString() {
        return "Loan{" +
                "type='" + type + '\'' +
                ", rate=" + rate +
                ", amount=" + amount +
                ", lenght='" + lenght + '\'' +
                '}';
    }

}

