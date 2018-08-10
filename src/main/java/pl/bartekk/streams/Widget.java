package pl.bartekk.streams;

import lombok.Getter;
import lombok.Setter;

public class Widget {

//    @Getter
//    @Setter
    private String color;
//    @Getter
//    @Setter
    private int weight;

    public Widget(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
