package ua.lviv.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)
public class Bicycle extends AbstractBicycle{
    private String type;
    public Bicycle(String brand, String type, int maxSpeed, int currentSpeed) {
        super(brand, maxSpeed, currentSpeed);
        this.type = type;
    }


    @Override
    public int getMaxDistance(){
        return Integer.MAX_VALUE;
    }


}
