package ucu.edu.ua.demo.item;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public class BasketDecorator extends ItemDecorator{
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 4 + item.price();
    }
}
