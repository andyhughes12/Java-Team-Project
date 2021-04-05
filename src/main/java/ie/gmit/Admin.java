package ie.gmit;

public class Admin {

    private String username;
    private String password;
    private int employeeNum;

    public Admin(String username, String password, int employeeNum)
    {
        setUsername(username);
        //setPassword(password);
       // setEmployeeNum(employeeNum);

    }

    public void setUsername(String username){
        if(username.length()>3)
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

}
