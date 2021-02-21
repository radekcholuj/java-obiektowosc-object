import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        RealEstateRepo repo = new RealEstateRepo();

        int option;
        do{
            System.out.println("---------- Real Estate App --------");
            System.out.println("1 - add real estate");
            System.out.println("2 - dispaly all");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option){
                case 1:
                    System.out.print("Number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Bound: ");
                    String bound = scanner.nextLine();

                    System.out.print("Land register number:");
                    String landRegisterNumber = scanner.nextLine();

                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    System.out.println("--- address ---");
                    System.out.print("Street: ");
                    String street = scanner.nextLine();

                    System.out.print("House number: ");
                    int houseNumber = scanner.nextInt();

                    System.out.print("Flat number:");
                    int flatNumber = scanner.nextInt();
                    scanner.nextLine(); // \n

                    System.out.print("Postcode: ");
                    String postcode = scanner.nextLine();

                    System.out.print("City: ");
                    String city = scanner.nextLine();

                    Address address = new Address(street, houseNumber, flatNumber, postcode, city);
                    RealEstate realEstate = new RealEstate(number, bound, address, landRegisterNumber, description);

                    repo.add(realEstate);
                    break;
                case 2:
                    repo.displayAll();
                    break;
            }

        } while(option != 0);
    }
}
