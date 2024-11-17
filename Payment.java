package BSIT2103_FDOS;

public class Payment {
    private double itemsPrice;
    private double paymentAmount;
    private double totalBill;
    private double tip;
    
    public Payment(double paymentAmount, double tip, double itemsPrice, double totalBill){
        this.paymentAmount = paymentAmount;
        this.tip = tip;
        this.itemsPrice = itemsPrice;
        this.totalBill = totalBill;
    }

    public double getAmount() {
        return paymentAmount;
    }

    public void setAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    
    public double getTip() {
        return tip;
    } 
    
    public void setTip(double tip) {
        this.tip = tip;
    }
    
    public double calculateTip(double paymentAmount){
        this.tip = paymentAmount * 0.15;
        return this.tip;
    }
    
    public double calculateTotal(double tip, double itemsPrice){
        return totalBill = tip + itemsPrice;
    }
    
    public void processPayment(){
        
    }
}
