public class Order {
    private int idOrder;
    private String dateOrder;
    private double priceOrder;
    private String deliveryDate;
    private Customer customer;

    public Order(){
        Payment payment = new Payment(customer, customer.creditCard);
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public double getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(double priceOrder) {
        this.priceOrder = priceOrder;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order(Cart cart, Customer customer) {
        this.customer = customer;
        this.priceOrder = cart.getCartPrice();
    }

    public class Payment {
        private int idPayment;
        private CreditCard creditCard;
        private double pricePayment;

        public Payment(Customer customer, CreditCard creditCard) {
            this.creditCard = creditCard;
            pricePayment = priceOrder;
        }

    }
}
