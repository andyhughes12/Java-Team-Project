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

    public void setPassword(String password){
        if(password.length()>7)
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
        if(employeeNum>=10)
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
}
