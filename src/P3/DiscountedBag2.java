package P3;

// 코드 3-4
public class DiscountedBag2 extends Bag {
    private double discountedRate;
    
    
    public void setDiscounted(double discountedRate) {
        this.discountedRate = discountedRate;
    }
    
    public void setPrice(int price) {
        super.setPrice(price - (int)(discountedRate * price));
    }
}
