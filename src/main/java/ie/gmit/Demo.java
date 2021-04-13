package ie.gmit;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

        // display a welcome message
        System.out.println("Welcome to the Banking System");
        System.out.println("Please choose an option: ");
        System.out.println("1.Client");
        System.out.println("2.Loan");
        System.out.println("3.Admin");
        System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter option: ");
        int option = sc.nextInt();  // read the product code

        switch(option) {
            case 1:
                ClientT();
                break;
            case 2:
                loan();
                break;
            case 3:
                AdminT();
                break;
            default:
                System.out.print("Invalid Option");

        }
        System.out.println();
    }


    public static void loan() {

        System.out.print("Student");
        System.out.println();
        System.out.print("Personal");
        System.out.println();
        System.out.print("Mortgage");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Loan Type: ");
        String LoanType = sc.nextLine();


        Loan d = LoanDB.getLoan(LoanType);


        System.out.println();
        if (d != null) {
            System.out.println("type='" + d.getType() + '\'' +
                    ", rate=" + d.getRate() +
                    ", amount=" + d.getAmount() +
                    ", length='" + d.getLenght() + '\'');
        } else {
            System.out.println("No product matches this product code.");
        }
    }

    public static void ClientT() {
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter option: ");
        int option1 = sc.nextInt();
        switch (option1) {
            case 1:
                Client c2 = new Client("Mr", "Andrew Hughes", "Andrew", "Hughes", "1234567880", "H91R7YX", "432111111112", "G001@gmit.ie", 22, 6000.00);
                System.out.print("Name: " + c2.getFullName());
                System.out.println();
                System.out.print("Balance: " + c2.getBalance());
                System.out.println();
                ClientDeposit();
                break;
            case 2:
                Client c1 = new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00);
                System.out.print("Name: " + c1.getFullName());
                System.out.println();
                System.out.print("Balance: " + c1.getBalance());
                ClientWithdraw();
                break;
        }
    }

    private static void ClientWithdraw() {
        Client c1 = new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.00);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw: ");
        int withdraw = sc.nextInt();
        c1.withdraw(withdraw);
        System.out.println(c1.getBalance());
    }

    private static void ClientDeposit() {
        Client c2 = new Client("Mr", "Andrew Hughes", "Andrew", "Hughes", "1234567880", "H91R7YX", "432111111112", "G001@gmit.ie", 22, 6000.00);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to deposit: ");
        int deposit = sc.nextInt();  // read the product code
        c2.deposit(deposit);
        System.out.println("New balance: " + c2.getBalance());
    }

    private static void AdminT(){
        Admin ad2 = new Admin("Joe", "gxf5000", 1123456789);
        System.out.println("Admin Username: " + ad2.getUsername());
        Client client = new Client("Mr", "Jack Sheridan", "Jack", "Sheridan", "1234567890", "H91R7YX", "432111111111", "G00@gmit.ie", 20, 5000.0);
        System.out.println("Client Name:" + client.getFullName());
        System.out.println("Client ID:" +client.getId());
        System.out.println("Client Contact Details: " + " Phone Number: " + client.getPhone() + "Email: "+ client.getEmail());
        System.out.println("Client Balance: " +client.getBalance());





    }



}
