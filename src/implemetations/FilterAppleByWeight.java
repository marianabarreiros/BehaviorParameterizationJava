package implemetations;

import interfaces.ApplePredicate;
import product.Apple;

public class FilterAppleByWeight implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
    
}
