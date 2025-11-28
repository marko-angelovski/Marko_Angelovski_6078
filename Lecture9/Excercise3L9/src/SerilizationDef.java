import java.io.Serializable;

public class SerilizationDef implements Serializable {
    private String productName;
    private String getProductFeature;
    transient private int featureCount;

    @Override
    public String toString() {
        return "SerilizationDef{" +
                "productName='" + productName + '\'' +
                ", getProductFeature='" + getProductFeature + '\'' +
                ", featureCount=" + featureCount +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getGetProductFeature() {
        return getProductFeature;
    }

    public void setGetProductFeature(String getProductFeature) {
        this.getProductFeature = getProductFeature;
    }

    public int getFeatureCount() {
        return featureCount;
    }

    public void setFeatureCount(int featureCount) {
        this.featureCount = featureCount;
    }
}
