
package product;

public class Apple {
    private String color;
    private int Weight;

    public Apple(String color, int Weight) {
        this.color = color;
        this.Weight = Weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return Weight;
    }
    
    public String toString(){
        return "Maçã "+this.getColor()+ " com peso "+this.getWeight();
    }
}
