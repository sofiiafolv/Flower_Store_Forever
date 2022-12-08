package ucu.edu.ua.demo.item;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public class RomashkaFlower extends Item{
    private double price;

    @Override
    public double price() {
        return price;
    }
}
