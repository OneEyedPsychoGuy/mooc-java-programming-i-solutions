public class Apartment {
    private int rooms;
    private int squareInches;
    private int pricePerSquareInch;

    public Apartment(int rooms, int squareInches, int pricePerSquareInch) {
        this.rooms = rooms;
        this.squareInches = squareInches;
        this.pricePerSquareInch = pricePerSquareInch;
    }

    public boolean largerThan(Apartment compared) {
        return this.squareInches > compared.squareInches;
    }
}