import java.util.Objects;

public class Cat extends Animal {
    private String litterBox;

    public Cat(String name, int age, String size, String litterBox) {
        super(name, age, size);
        this.litterBox = litterBox;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(litterBox, cat.litterBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), litterBox);
    }
}