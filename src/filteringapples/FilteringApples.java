package filteringapples;

import interfaces.ApplePredicate;
import java.util.ArrayList;
import java.util.List;
import product.Apple;

public class FilteringApples {
    public List<Apple> filterApples(List<Apple> apples, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }             
        return result;
    }
}
