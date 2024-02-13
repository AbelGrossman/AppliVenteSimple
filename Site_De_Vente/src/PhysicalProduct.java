public class PhysicalProduct extends Product{
    private int stockProduct;
    public int getStockProduct() {
        return stockProduct;
    }
    public void setStockProduct(int stockProduct) {
        this.stockProduct = stockProduct;
    }
    public double getWeightProduct() {
        return weightProduct;
    }
    public void setWeightProduct(double weightProduct) {
        this.weightProduct = weightProduct;
    }
    public String getDimensionsProduct() {
        return dimensionsProduct;
    }
    public void setDimensionsProduct(String dimensionsProduct) {
        this.dimensionsProduct = dimensionsProduct;
    }
    private double weightProduct;
    private String dimensionsProduct;
}
