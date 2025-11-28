public class Parent {
    private String productName;
    private int productId;

    @Override
    public String toString() {
        return "Parent{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
