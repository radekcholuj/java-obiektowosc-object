import java.util.Objects;

public class Address {
    private String street;
    private int houseNumber;
    private int flatNumber;
    private String postcode;
    private String city;

    public Address(String street, int houseNumber, int flatNumber, String postcode, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postcode = postcode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", flatNumber=" + flatNumber +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber &&
                flatNumber == address.flatNumber &&
                Objects.equals(street, address.street) &&
                Objects.equals(postcode, address.postcode) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, houseNumber, flatNumber, postcode, city);
    }
}
