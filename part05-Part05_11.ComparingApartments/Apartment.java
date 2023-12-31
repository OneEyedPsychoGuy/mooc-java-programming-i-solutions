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

    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.price() > compared.price();
    }

    private int price() {
        return this.squareInches * this.pricePerSquareInch;
    }
}