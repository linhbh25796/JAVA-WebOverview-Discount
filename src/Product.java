public class Product {
    private String description;
    private float price;
    private int discount_percent;
    private float dicount_amount;
    private float discount_price;

    public Product(){

    }

    public Product(String description, float price, int discount_percent, float dicount_amount, float discount_price) {
        this.description = description;
        this.price = price;
        this.discount_percent = discount_percent;
        this.dicount_amount = dicount_amount;
        this.discount_price = discount_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(int discount_percent) {
        this.discount_percent = discount_percent;
    }

    public float getDicount_amount() {
        return dicount_amount;
    }

    public void setDicount_amount(float dicount_amount) {
        this.dicount_amount = dicount_amount;
    }

    public float getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(float discount_price) {
        this.discount_price = discount_price;
    }
}
