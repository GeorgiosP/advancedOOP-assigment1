package products;

import manufacturer.Manufacturer;

/**
 * Created by gpsar on 10/9/2016.
 * for advanced java fall 2016
 */
public class Product {
    /*
     * String name
     * double price
     * Manufacturer manufacturedBy
     *
     */
    private String productName;
    private double Price;
    private Manufacturer manufacturedBy;

    public Product(String productName, double price, Manufacturer manufacturedBy){
        this.productName = productName;
        this.Price = price;
        this.manufacturedBy = manufacturedBy;

    }

    public double getPrice() {
        return Price;
    }

    public Manufacturer getManufacturedBy() {
        return manufacturedBy;
    }

    public String getProductName() {
        return productName;
    }

    public void setManufacturedBy(Manufacturer manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String toString() {
        String productInfo = "";

        productInfo+= "\n****Product Information****";
        productInfo+= "\nProduct: " + getProductName();
        productInfo+= "\nPrice: " + getPrice();
        productInfo+= manufacturedBy.toString();
        productInfo+= "\n***************************";

        return productInfo;
    }
}
