package P3;

// 코드 3-3

public class DiscountedBag extends Bag {
    private double discountedRate = 0;
    
    
    public void setDiscounted(double discountedRate) {
        this.discountedRate = discountedRate;
    }
    
    public void applyDiscount(int price) {
        super.setPrice(price - (int)(discountedRate * price));
    }
}
