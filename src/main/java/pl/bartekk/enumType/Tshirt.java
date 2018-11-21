package pl.bartekk.enumType;

import java.util.Arrays;

public class Tshirt {

    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Nike");
        System.out.println(tshirt.size);

        // switch
        switch (tshirt.size) {
            case S:
                System.out.println("S");
                break;
            case M:
                System.out.println("M");
                break;
            case L:
                System.out.println("L");
                break;
            case XL:
                System.out.println("XL");
                break;
        }

        // methods
        System.out.println(TshirtSize.L.ordinal());
        System.out.println(TshirtSize.L.name());
        System.out.println(Arrays.toString(TshirtSize.values()));
        System.out.println(TshirtSize.valueOf("L"));
    }
}