import java.util.Objects;

public class RealEstate {
    private int number;
    private String bound;
    private Address address;
    private String landRegisterNumber;
    private String description;

    public RealEstate(int number, String bound, Address address, String landRegisterNumber, String description) {
        this.number = number;
        this.bound = bound;
        this.address = address;
        this.landRegisterNumber = landRegisterNumber;
        this.description = description;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "number=" + number +
                ", bound='" + bound + '\'' +
                ", address=" + address +
                ", landRegisterNumber='" + landRegisterNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealEstate that = (RealEstate) o;
        return number == that.number &&
                Objects.equals(bound, that.bound) &&
                Objects.equals(address, that.address) &&
                Objects.equals(landRegisterNumber, that.landRegisterNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, bound, address, landRegisterNumber);
    }
}
