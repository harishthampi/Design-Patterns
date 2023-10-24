package AdapterDesignPattern;

import AdapterDesignPattern.ThirdParty.ICICBank.ICICBankAPI;

public class ICICBankAPIAdapter implements BankAPIAdapter{
    private ICICBankAPI icicBankAPI = new ICICBankAPI();
    @Override
    public double getBalance(String accountNumber) {
//       String balance = icicBankAPI.getBalance();
//       double doubleBalance = Double.parseDouble(balance);
//       return doubleBalance;
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double Amount) {
        return false;
    }
}
