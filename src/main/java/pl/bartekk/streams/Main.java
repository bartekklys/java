package pl.bartekk.streams;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //IntStream.range(0, 10).skip(5).forEach(System.out::println);

        List<Widget> widgets = new ArrayList<>();
        widgets.add(new Widget("RED", 10));
        widgets.add(new Widget("BLUE", 42));
        widgets.add(new Widget("RED", 44));
        widgets.add(new Widget("BLUE", 31));
        widgets.add(new Widget("RED", 3));

        //System.out.println(widgets.stream().filter(w -> w.getColor().equals("RED")).mapToInt(Widget::getWeight).sum());

        Arrays.stream(new int[] {2, 5, 8, 4, 9, 3})
            .map(x -> x * x).average()
            .ifPresent(System.out::println);

        List<String> cars = Arrays.asList("BMW", "Audi", "Bentley", "Skoda", "Aston Martin", "Bugatti", "BMW");
        cars.stream().map(String::toLowerCase).filter(x -> x.startsWith("b")).distinct().sorted().forEach(System.out::println);



    }
}
