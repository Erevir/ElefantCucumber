package elefantCucumber.entity;


public class Product {
    String product;
    String qty;

    public Product(String product, String qty) {
        this.product = product;
        this.qty = qty;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
