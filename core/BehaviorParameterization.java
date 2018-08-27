package core;

import implemetations.FilterAppleByWeight;
import implemetations.FilterGreenApples;
import implemetations.FilterRedApples;
import interfaces.ApplePredicate;
import java.util.Arrays;
import java.util.List;
import product.Apple;
import selectionCriteria.SelectionCriteria;

public class BehaviorParameterization {

    public static void main(String[] args) {
        Apple apple1 = new Apple("red", 160);
        Apple apple2 = new Apple("green", 110);
        Apple apple3 = new Apple("green", 200);
        Apple apple4 = new Apple("green", 50);
        Apple apple5 = new Apple("red", 175);
        Apple apple6 = new Apple("red", 183);
        Apple apple7 = new Apple("red", 80);
        
        ApplePredicate filterAppleByWeight = new FilterAppleByWeight();
        ApplePredicate filterGreenApple = new FilterGreenApples();
        ApplePredicate filterRedApple = new FilterRedApples();
        
        SelectionCriteria selectionCriteria = new SelectionCriteria();
        
        List<Apple> inventory = Arrays.asList(apple1, apple2, apple3, apple4, apple5, apple6, apple7);
        System.out.println(selectionCriteria.filterApples(inventory, filterGreenApple));
    }
    
}
