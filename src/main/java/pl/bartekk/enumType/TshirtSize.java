package pl.bartekk.enumType;

/**
 * każdy enum domyślnie dziedziczy po java.lang.Enum
 */
public enum TshirtSize {
    S(48, 71, 36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    private int chestWidth;
    private int shirtLength;
    private int sleeveLength;

    // nie możesz go wywołać poza definicją enuma
    // Każde inne użycie powoduje błąd kompilacji
    // private by default
    TshirtSize(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }
}
