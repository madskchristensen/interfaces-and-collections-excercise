import java.util.*;

public class Generate {
    private int maxRadius;
    private int maxWidth;
    private int maxHeight;
    private Random random = new Random();

    public String randomIdentifier() {
        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

        StringBuilder builder = new StringBuilder();
        int length = random.nextInt(5)+5;

            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(random.nextInt(lexicon.length())));
            }
        return builder.toString();
    }

    public Person randomPerson() {
        return new Person(randomIdentifier(), random.nextInt(120), random.nextBoolean());
    }

    public List<Person> randomPersonList(int size) {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(randomPerson());
        }
        return list;
    }

    public Stock randomStock() {
        return new Stock(random.nextInt(50000));
    }

    public Stock randomStock(int price) {
        return new Stock(price);
    }

    public List<Stock> randomStockList(int size) {
        List<Stock> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(randomStock());
        }

        return list;
    }

    public GeometricShape randomShape(int maxRadius, int maxWidth, int maxHeight) {
        int shape = random.nextInt(2);
        int radius = random.nextInt(maxRadius);
        int width = random.nextInt(maxWidth);
        int height = random.nextInt(maxHeight);

        if (shape == 0) {
            return new Circle(radius);
        } else {
            return new Rectangle(width, height);
        }
    }

    public GeometricShape randomShape() {
        int shape = random.nextInt(2);
        int radius = random.nextInt(this.maxRadius);
        int width = random.nextInt(this.maxWidth);
        int height = random.nextInt(this.maxHeight);

        if (shape == 0) {
            return new Circle(radius);
        } else {
            return new Rectangle(width, height);
        }
    }

    public List<GeometricShape> randomShapeList(int size) {
        int radius = random.nextInt(this.maxRadius);
        int width = random.nextInt(this.maxWidth);
        int height = random.nextInt(this.maxHeight);

        List<GeometricShape> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(randomShape(radius, width, height));
        }
        return list;
    }

    public List<GeometricShape> randomShapeList(int size, int maxRadius, int maxWidth, int maxHeight) {
        List<GeometricShape> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(randomShape(maxRadius, maxWidth, maxHeight));
        }
        return list;
    }

    public Generate(int maxRadius, int maxWidth, int maxHeight) {
        if (maxRadius < 0 || maxWidth < 0 || maxHeight < 0) {
            throw new IllegalArgumentException("Constructor of type \"Generate\" only accepts positive integers");
        }
        this.maxRadius = random.nextInt(maxRadius);
        this.maxWidth = random.nextInt(maxWidth);
        this.maxHeight = random.nextInt(maxHeight);
    }

    public int getMaxRadius() {
        return maxRadius;
    }

    public void setMaxRadius(int maxRadius) {
        this.maxRadius = maxRadius;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}