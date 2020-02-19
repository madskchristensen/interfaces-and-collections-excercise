import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Generate generate = new Generate(500, 500, 200);

        List<GeometricShape> listShapes = generate.randomShapeList(100);

        for (GeometricShape shape : listShapes) {
            System.out.println(shape);
        }

        List<Stock> listStocks = generate.randomStockList(10);
        System.out.println(listStocks);
        Collections.sort(listStocks);
        System.out.println(listStocks);

        // List<Person> listPeople = generate.randomPersonList(10);
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Dan", 30, true));
        listPeople.add(new Person("Carsten", 30, false));
        listPeople.add(new Person("Sigurd", 29, true));
        listPeople.add(new Person("Majbrit", 29, false));
        listPeople.add(new Person("Niels", 30, true));
        listPeople.add(new Person("Oa", 29, false));
        listPeople.add(new Person("Ove", 30, false));
        listPeople.add(new Person("Carst", 30, false));
        listPeople.add(new Person("Ole", 30, false));
        listPeople.add(new Person("Oa", 30, false));
        listPeople.add(new Person("Oa", 30, true));

        System.out.println(listPeople);
        Collections.sort(listPeople);
        System.out.println(listPeople);
    }
}
