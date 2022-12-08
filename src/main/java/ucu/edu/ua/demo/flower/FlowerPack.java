package ucu.edu.ua.demo.flower;

import ucu.edu.ua.demo.flower.Flower;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        return flower.getPrice()*quantity;
    }
    public Flower getFlower() {
        return flower;
    }
}
