
package eCommerce;

public class Product {
    
        private String productName;
        private String productColor;
        private String productCategory;
        private int productStock;
        private double productWeight;
        private String productDescription;

    public Product(String productName, String productColor, String productCategory, int productStock, double productWeight, String productDescription) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    public void stockControl(int orderNumber){
        if(this.productStock >= orderNumber){
        this.productStock -= orderNumber;
            System.out.println("Order is successful || "+ " Your order is " + orderNumber + " " + this.getProductName());
        }
        else{
            System.out.println("Not enough stock for " + this.getProductName() + "!!!");
        }
    }
    
    
    
    
    
    
    
}
