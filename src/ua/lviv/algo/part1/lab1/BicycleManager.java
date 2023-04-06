package ua.lviv.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;

public class BicycleManager {

    public static void main(String[] args) {
        List<AbstractBicycle> bicycles = new ArrayList<>();
        Bicycle bicycle1 = new Bicycle("Ворскла", "mountain", 63, 2);
        Bicycle bicycle2 = new Bicycle("Submit", "forest", 33, 3);
        ElectricBicycle electricBicycle1 = new ElectricBicycle("Motion", 634, 8, 305, 5);
        ElectricBicycle electricBicycle2 = new ElectricBicycle("Freak", 90, 45, 450, 5);

        bicycles.add(bicycle1);
        bicycles.add(bicycle2);
        bicycles.add(electricBicycle1);
        bicycles.add(electricBicycle2);

        bicycles.forEach(bicycle -> System.out.println(bicycle.toString()));

    }
}
