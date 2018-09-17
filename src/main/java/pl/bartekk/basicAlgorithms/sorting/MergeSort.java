package pl.bartekk.basicAlgorithms.sorting;

public class MergeSort {

    private static int array[] = {50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        System.out.println(howManyCoins(51));
    }

    private static int howManyCoins(int amount) {

        int coin50 = amount / array[0];
        amount = amount - array[0] * coin50;
        int coin20 = amount / array[1];
        amount = amount - array[1] * coin20;
        int coin10 = amount / array[2];
        amount = amount - array[2] * coin10;
        int coin5 = amount / array[3];
        amount = amount - array[3] * coin5;
        int coin2 = amount / array[4];
        amount = amount - array[4] * coin2;
        int coin1 = amount / array[5];

        return coin50 + coin20 + coin10 + coin5 + coin2 + coin1;
    }
}
