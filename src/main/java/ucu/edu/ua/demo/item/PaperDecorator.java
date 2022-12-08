package ucu.edu.ua.demo.item;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor @ToString
public class PaperDecorator extends ItemDecorator{
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 13 + item.price();
    }
}
