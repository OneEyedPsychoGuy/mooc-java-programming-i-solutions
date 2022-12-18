public class Cube {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.side + " and the volume " + this.volume();
    }
}