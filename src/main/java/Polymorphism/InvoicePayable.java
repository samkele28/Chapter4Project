package Polymorphism;

/**
 * Created by Samkele on 3/27/2016.
 */
public class InvoicePayable implements PayableAmount {

    private String productNumber;
    private int quantity;
    private double pricePerItem;

    public InvoicePayable(String productNumber, int quantity, double pricePerItem) {
        this.productNumber = productNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }

}
