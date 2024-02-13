public class Cart {
    private int idCart;
    private double cartPrice;
    private Customer customer;
    
    public int getIdCart() {
        return idCart;
    }
    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }
    public double getCartPrice() {
        return cartPrice;
    }
    public void setCartPrice(double cartPrice) {
        this.cartPrice = cartPrice;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
