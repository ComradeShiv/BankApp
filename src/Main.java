
public class Main {
    public static void main(String[] args) {

        HDFCAccount shivAcc = new HDFCAccount("Shiv", "justTry", 2000.00);

        System.out.print(shivAcc); // printed the attributes via toString

        System.out.println(shivAcc.fetchBalance("justrying"));
        System.out.println(shivAcc.fetchBalance("justTry"));

        System.out.println(shivAcc.addMoney(100000));

        System.out.println(shivAcc.withDrawMoney(200000, "justTry"));
        System.out.println(shivAcc.withDrawMoney(50000, "justTry"));
        System.out.println(shivAcc.withDrawMoney(2000, "random"));


        System.out.println(shivAcc.changePassword("justTry", "justTrying"));
        System.out.println(shivAcc.fetchBalance("justTrying"));

        System.out.println("Interest for 5 years on current balance will be: " + shivAcc.calculateInterest(5));
    }
}