public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private boolean married;

    public String toString() {
        return "[Name: " + name + " | " + "Age: " + age + " | " + "Married: " + married + "]";
    }

    @Override
    public int compareTo(Person other) {
        int nameComparison;

        nameComparison = name.compareTo(other.name);
        // System.out.println(name + " compared to " + other.name + " nameresult = " + nameComparison);

        if (nameComparison > 0) {
            return nameComparison;
        } else if (nameComparison < 0) {
            return nameComparison;
        }

        if (age < other.age) {
            return -1;
        } else if (age > other.age) {
            return 1;
        }

        if (married && !other.married) {
            return -1;
        } else if (!married && !other.married) {
            return 1;
        }

        return 0;
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
