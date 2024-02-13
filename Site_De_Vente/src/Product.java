public abstract class Product {
    private int idProduct;
    private String nameProduct;
    private double priceProduct;
    private String descriptionProduct;

    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public double getPriceProduct() {
        return priceProduct;
    }
    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }
    public String getDescriptionProduct() {
        return descriptionProduct;
    }
    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }
 
}
