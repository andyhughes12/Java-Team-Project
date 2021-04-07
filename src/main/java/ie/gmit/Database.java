package ie.gmit;

public class Database extends Admin{

    private String ClientName;
    private String ClientID;
    private String ClientPhone;
    private double ClientBalance;

    public Database(String ClientName, String ClientID, String ClientPhone,double ClientBalance) {
        super();
        setClientName(ClientName);
        setClientID(ClientID);
        setClientPhone(ClientPhone);
        setClientBalance(ClientBalance);
    }

    public String getName() { return ClientName; }

    public String getId() { return ClientID; }

    public String getPhone() { return ClientPhone; }

    public double getBalance() { return ClientBalance; }


    public void setClientName(String ClientName) {
        if( ClientName.length() > 2 )
        {
            this.ClientName = ClientName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid name");
        }
    }
    public void setClientID(String ClientID) {
        if( ClientID.length() > 9 )
        {
            this.ClientID = ClientID;
        }
        else
        {
            throw new IllegalArgumentException("Invalid id");
        }
    }

    public void setClientPhone(String ClientPhone) {
        if( ClientPhone.length() > 10 )
        {
            this.ClientPhone = ClientPhone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid phone");
        }
    }
    public void setClientBalance(double ClientBalance) {

        if( ClientBalance >= 0 )
        {
            this.ClientBalance = ClientBalance;
        }
        else
        {
            throw new IllegalArgumentException("Invalid balance");
        }
    }
}
