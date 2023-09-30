import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
    private String accountNo; // unique - UUID(Universally Unique Identifier) - generates a random number which will be unique in the entire universe
    private String password;
    private double balance;
    final double rateOfInterest = 7.1;
    final String IFSCCode = "HDFC958917";

    // default constructor
    public HDFCAccount() {
    }

    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {

        if(this.password.equals(password)) {
            return "Your balance is: " + this.balance;
        }

        return "Incorrect Password!!!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Amount added successfully. New balance is: " + this.balance;
    }

    @Override
    public String withDrawMoney(double amount, String password) {
        if(this.password.equals(password)) {
            if(this.balance >= amount) {
                this.balance -= amount;
                return "Amount withdrawn successfully. New balance is: " + this.balance;
            }
            return "Insufficient balance. Sorry!!!";
        }
        return "Incorrect Password!!!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)) {
            this.password = newPassword;
            return "Password changed successfully";
        }
        return "Incorrect original password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance * year * rateOfInterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" + '\n' +
                "name = " + name + "," + '\n' +
                "accountNo = " + accountNo + "," + '\n' +
                "password = " + password + "," + '\n' +
                "balance = " + balance + "," + '\n' +
                "rateOfInterest = " + rateOfInterest + "," + '\n' +
                "IFSCCode = " + IFSCCode + "," + '\n' +
                '}';
    }
}
