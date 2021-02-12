
package planetfood.pojo;

public class Product {

    private String prodId;
    private String catId;
    private String prodName;
    private double prodPrice;
    private String isActive;
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String proId) {
        this.prodId = proId;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
   
    
}
