package ua.lviv.algo.part1.lab1;

import lombok.ToString;

@ToString (callSuper = true)
public class ElectricBicycle extends AbstractBicycle{
    public ElectricBicycle(String brand, int maxSpeed, int currentSpeed, int capacityOfBattery,int chargeConsumptionPer100meters) {
        super(brand, maxSpeed, currentSpeed);
        this.capacityOfBattery = capacityOfBattery;
        this.chargeConsumptionPer100meters = chargeConsumptionPer100meters;
    }

    private int capacityOfBattery;

    private  int chargeConsumptionPer100meters;

    @Override
    public int getMaxDistance() {
        return capacityOfBattery / chargeConsumptionPer100meters * 100;
    }
}
