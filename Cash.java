package BSIT2103_FDOS;

public class Cash extends Payment{
    private double change;
    private double calculatedTip = 0;
    private double totalBillCash = 0;
    
    public Cash(double paymentAmount, double tip, double itemsPrice, double totalBill){
        super(paymentAmount, tip, itemsPrice, totalBill);
    }
    
    @Override
    public void processPayment(){
        getAmount();
    }
    
    @Override
    public double calculateTip(double paymentAmount){
        setTip(calculatedTip);
        return calculatedTip;
    }
    
    @Override
    public double calculateTotal(double calculatedTip, double itemsPrice){
        return totalBillCash = calculatedTip + itemsPrice;
    }
    
    public double returnChange(double paymentAmount, double totalBill){
        return change = totalBillCash - paymentAmount;
    }
}
