public class BankAccountTest{
    public static void main(String[]args){
        // 1=checking 2=savings
        BankAccount one = new BankAccount();
        one.deposit(100,"checking");
        one.deposit(200,"savings");
        System.out.println(one.getCheckingBalance());
        System.out.println(one.getSavingBalance());
        one.withdraw(300,"checking");
        one.withdraw(300,"savings");
        one.withdraw(50,"checking");
        one.withdraw(50,"savings");
        System.out.println(one.getBalances());
    }
}