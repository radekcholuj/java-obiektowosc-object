import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private String size;

    public Animal(String name, int age, String size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = " + name  +
                ", age = " + age +
                ", size = " + size  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(size, animal.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, size);
    }
}
