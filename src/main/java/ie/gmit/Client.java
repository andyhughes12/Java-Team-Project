//  Jack Sheridan
//  G00326495
//  ClientAccount

package ie.gmit;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    private String title;
    private String name;
    private String id;
    private String eircode;
    private String phone;
    private String email;
    private double balance;
    private int age;

    public Client(String title, String name, String id, String eircode, String phone, String email, int age, double balance) // Add email
    {
        setTitle(title);
        setName(name);
        setId(id);
        setEircode(eircode);
        setPhone(phone);
        setEmail(email);
        setBalance(balance);
        setAge(age);
    }

    public void toSting() {
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


    public String setName(String name) {
        if( name.length() > 2 )
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Invalid name");
        }

        return name;
    }

    public String getName() {
        return name;
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
    public int getAge() { return age; }

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

    public double getBalance(){ return balance; }


    @Override
    public String toString() {
        return super.toString() + " by " + title;
    }
}
