package ucu.edu.ua.demo.item;

abstract public class Item {
    private String description;

    public String getDescription() {
        return description;
    }
    public abstract double price();

}
