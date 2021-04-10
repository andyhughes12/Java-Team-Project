package ie.gmit;

public class Admin {

    private String username;
    private String password;
    private long employeeNum;

    public Admin(String username, String password, long employeeNum)
    {
        setUsername(username);
        setPassword(password);
        setEmployeeNum(employeeNum);

    }

    public Admin() { }

    public void setUsername(String username){
        if(username.length()>=3)
        {
            this.username = username;
        } else
        {
            throw new IllegalArgumentException("Invalid username");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password){
        if(password.length()>=7)
        {
            this.password = password;
        } else
        {
            throw new IllegalArgumentException("Invalid password");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setEmployeeNum(long employeeNum){
        int length = String.valueOf(employeeNum).length();
        if(length == 10)
        {
            this.employeeNum = employeeNum;
        } else
        {
            throw new IllegalArgumentException("Invalid Employee Number");
        }
    }

    public long getEmployeeNum() {
        return employeeNum;
    }


    public String getClientDetails(Client client){
        String title = client.getTitle();
        String fullName = client.getFullName();
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        String id = client.getId();
        String eircode = client.getEircode();
        String phone = client.getPhone();
        String email = client.getEmail();
        double balance = client.getBalance();
        //int age = client.getAge();
        String clientDetails = "Title = " + title + "full name = " + fullName + "first name = " + firstName + "last name = " + lastName + "ID" + id + "Eircode" + eircode + "Phone Number" + phone + "Email = " + email + "Balance: " + balance + "Age:" ;

        return clientDetails;
    }


}
