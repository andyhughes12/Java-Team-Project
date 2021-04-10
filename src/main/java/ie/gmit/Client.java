//  Jack Sheridan
//  G00326495
//  ClientAccount

package ie.gmit;


//import java.util.ArrayList;
//import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    private String title;
    private String fullName;
    private String firstName;
    private String lastName;
    private String id;
    private String eircode;
    private String phone;
    private String email;
    private double balance;
    private int age;
    //private List<Transaction> transactions = new ArrayList<Transaction>();

    public Client(String title, String fullName, String firstName, String lastName, String id, String eircode, String phone, String email, int age, double balance)
    {
        setTitle(title);
        setFullName(fullName);
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        setEircode(eircode);
        setPhone(phone);
        setEmail(email);
        setBalance(balance);
        setAge(age);
    }


    public void setTitle(String title) {
        if( (title == "Mr") || (title == "Mrs") || (title == "Ms") )
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid title");
        }
    }

    public String getTitle() {
        return title;
    }


    public void setFullName(String fullName) {

        String regexFULL = "\\w+ \\w+";

        Pattern pattern = Pattern.compile(regexFULL);

        Matcher matcher = pattern.matcher(fullName);
        boolean matchFound = matcher.find();

        if(matchFound && matchFound)
        {
            this.fullName = fullName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid full name");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFirstName(String firstName) {
        if( firstName.length() > 2 )
        {
            this.firstName = firstName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid first name");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        if( lastName.length() > 2 )
        {
            this.lastName = lastName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid last name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(String id) {
        if( id.length() > 9 )
        {
            this.id = id;
        }
        else
        {
            throw new IllegalArgumentException("Invalid id");
        }
    }

    public String getId() {
        return id;
    }

    public void setEircode(String eircode)
    {
        String regexEIR = "(?:^[AC-FHKNPRTV-Y][0-9]{2}|D6W)[ -]?[0-9AC-FHKNPRTV-Y]{4}$";

        Pattern pattern = Pattern.compile(regexEIR);

        Matcher matcher = pattern.matcher(eircode);
        boolean matchFound = matcher.find();

        if(matchFound && matchFound)
        {
            this.eircode = eircode;
        }
        else
        {
            throw new IllegalArgumentException("Invalid eircode");
        }
    }

    public String getEircode() {
        return eircode;
    }

    public void setPhone(String phone) {
        if( phone.length() > 10 )
        {
            this.phone = phone;
        }
        else
        {
            throw new IllegalArgumentException("Invalid phone");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {

        String regexEMAIL = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regexEMAIL);

        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();

        if(matchFound && matchFound)
        {
            this.email = email;
        }
        else
        {
            throw new IllegalArgumentException("Invalid email");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        if( age > 16 )
        {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public int getAge() { return age; }

    public void setBalance(double balance) {

        if( balance >= 0 )
        {
            this.balance = balance;
        }
        else
        {
            throw new IllegalArgumentException("Invalid balance");
        }
    }

    public double getBalance() { return balance; }

//    public void deposit(double amount){
//        if(amount>=5) {
//            Transaction transaction = new Transaction(amount, true, false);
//            transactions.add(transaction);
//            balance = balance + amount;
//        }
//        else
//        {
//            throw new IllegalArgumentException("Deposit amount must be at least 5 Euro");
//        }
//    }
//
//    public void withdraw(double amount){
//        if(amount >= 5 && amount < balance) {
//            Transaction transaction = new Transaction(amount, false, true);
//            transactions.add(transaction);
//            balance = balance - amount;
//        }
//        else
//        {
//            throw new IllegalArgumentException("Withdrawal amount must be at least 5 Euro and may not exceed balance");
//        }
//    }

//    @Override
//    public String toString() {
//        return super.toString() + " by " + title;
//    }
}
