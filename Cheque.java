package BSIT2103_FDOS;

public class Cheque extends Payment {
    private String accountBankNumber;
    private String signatory;
    private double calculatedTipCheque = 0;
    private double totalBillCheque = 0;
    
    public Cheque(double paymentAmount, double tip, double itemsPrice, double totalBill){
        super(paymentAmount, tip, itemsPrice, totalBill);
    }
    
    @Override
    public void processPayment(){
        getAmount();
    }
    
    @Override
    public double calculateTip(double paymentAmount){
        setTip(calculatedTipCheque);
        return calculatedTipCheque;
    }
    
    @Override
    public double calculateTotal(double calculatedTipCheque, double itemsPrice){
        return totalBillCheque = calculatedTipCheque + itemsPrice;
    }

    public String getAccountBankNumber() {
        return accountBankNumber;
    }

    public void setAccountBankNumber(String accountBankNumber) {
        this.accountBankNumber = accountBankNumber;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }
    
    public void checkCheque(String accountBankNumber){
        setAccountBankNumber(accountBankNumber);
    }
    
    public void signCheque(String signatory){
        setSignatory(signatory);
    }
}
