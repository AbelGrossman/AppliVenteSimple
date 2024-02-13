import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int idCart;
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Cart(Customer customer, Product product){
        this.customer = customer;
        products.add(product);
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Product product : products){
            totalPrice += product.getPriceProduct();
        }
        return totalPrice;
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
