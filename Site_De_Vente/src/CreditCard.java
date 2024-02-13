public class CreditCard {
    private int creditCardNumber;
    private int creditCardCVV;
    private String creditCardExpirationDate;
    private Customer customer;

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getCreditCardCVV() {
        return creditCardCVV;
    }

    public void setCreditCardCVV(int creditCardCVV) {
        this.creditCardCVV = creditCardCVV;
    }

    public String getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    public void setCreditCardExpirationDate(String creditCardExpirationDate) {
        this.creditCardExpirationDate = creditCardExpirationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
