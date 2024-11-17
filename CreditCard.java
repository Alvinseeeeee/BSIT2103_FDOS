package BSIT2103_FDOS;

public class CreditCard extends Payment{
    private String cardHolder;
    private int cardNumber;
    private double calculatedTipCC = 0;
    private double totalBillCC = 0;
    
    public CreditCard(double paymentAmount, double tip, double itemsPrice, double totalBill){
        super(paymentAmount, tip, itemsPrice, totalBill);
    }
    
    @Override
    public void processPayment(){
        getAmount();
    }
    
    @Override
    public double calculateTip(double paymentAmount){
        setTip(calculatedTipCC);
        return calculatedTipCC;
    }
    
    @Override
    public double calculateTotal(double calculatedTipCC, double itemsPrice){
        return totalBillCC = calculatedTipCC + itemsPrice;
    }

    public void enterCardNumber(int cardNumber){
        setCardNumber(cardNumber);
    }
    
    public void enterCardHolder(String cardHolder){
        setCardHolder(cardHolder);
    }
    
    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}
