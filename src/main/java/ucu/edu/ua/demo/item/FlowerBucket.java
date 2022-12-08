package ucu.edu.ua.demo.item;

import lombok.Getter;
import lombok.ToString;
import ucu.edu.ua.demo.flower.FlowerPack;
import ucu.edu.ua.demo.flower.FlowerType;
import ucu.edu.ua.demo.item.Item;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item {
    @Getter
    private List<FlowerPack> flbucket = new ArrayList<FlowerPack>();
    public void addFlowers(FlowerPack flpack) {
        flbucket.add(flpack);
    }

    @Override
    public double price() {
        double sum = 0;
        for (int i = 0; i < flbucket.size(); ++i) {
            sum += flbucket.get(i).getPrice();
        }
        return sum;
    }
    public boolean searchFlower(FlowerType flower_type){
        for(int i = 0; i < flbucket.size(); ++i) {
            if (flbucket.get(i).getFlower().getFlowerType() == flower_type){
                return true;
            }
        }
        return false;
    }
}
