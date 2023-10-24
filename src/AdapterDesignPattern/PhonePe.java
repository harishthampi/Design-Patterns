package AdapterDesignPattern;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;
    PhonePe(BankAPIAdapter bankAPIAdapter){
        this.bankAPIAdapter=bankAPIAdapter;
    }
    double dosomething() throws InterruptedException{
        double currentBalance = bankAPIAdapter.getBalance("4585456");
        return currentBalance;
    }
}
