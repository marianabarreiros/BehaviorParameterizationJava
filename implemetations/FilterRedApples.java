package implemetations;

import interfaces.ApplePredicate;
import product.Apple;

public class FilterRedApples implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("red");
                
    }
    
}
