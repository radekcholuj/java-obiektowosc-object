import java.util.Objects;

public class Dog extends Animal {
    private String race;

    public Dog(String name, int age, String size, String race) {
        super(name, age, size);
        this.race = race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(race, dog.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), race);
    }
}
