package ua.lviv.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@ToString
public abstract class AbstractBicycle {
    private String brand;
    private int maxSpeed;
    private int currentSpeed;
    public abstract int getMaxDistance();

}
