public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numAccounts;
    public static int totalMoneyStored;

    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingsBalance;
    }

    public void deposit(double amount, String type) {
        if (type == "checking") {
            this.checkingBalance += amount;
            totalMoneyStored += amount;
            System.out.println("$" + amount + " was deposited into your checkings account");
            }
        else if (type == "savings") {
            this.savingsBalance += amount;
            totalMoneyStored += amount;
            System.out.println("$" + amount + " was deposited into your savings account ");
        }
    }
    

    public void withdraw(int amount,String type){
        if (type == "checking") {
            if (amount <= this.checkingBalance) {
                this.checkingBalance -= amount;
                totalMoneyStored -= amount;
                System.out.println("$" + amount + " was withdrawn from your checking account");
            }
            else {
                System.out.println("insufficient funds");
            }
        }
        else if (type == "savings") {
            if (amount <= this.savingsBalance) {
                this.savingsBalance -= amount;
                totalMoneyStored -= amount;
                System.out.println("$" + amount + " was withdrawn from your saving account");
            }
            else {
                System.out.println("insufficient funds");
            }
    }
    }

    public String getBalances(){
        String str = "Savings Balance: $"+ this.savingsBalance+" | Checking Balance: $"+ this.checkingBalance;
        return str;
    }
}