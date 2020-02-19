public class Stock implements Comparable<Stock> {
    private int price;

    public Stock(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Stock other) {
        if (price < other.price) {
            return -1;
        } else if (price == other.price) {
            return 0;
        } else {
            return 1;
        }
    }

    public String toString() {
        return "[Price: " + price + "]";
    }
}
