import java.util.Scanner;

public class ShelterCiapkowoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        ShelterCiapkowoRepo shelterCiapkowoRepo = new ShelterCiapkowoRepo();

        do {
            System.out.println("------ Animal Shelter Ciapkowo ------");
            System.out.println("1 - add a cat: ");
            System.out.println("2 - add a dog: ");
            System.out.println("3 - displayAll: ");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Size: ");
                    String size = scanner.nextLine();

                    System.out.println("Litter Box (yes/no): ");
                    String litterBox = scanner.nextLine();

                    Cat cat = new Cat(name, age, size, litterBox);
                    shelterCiapkowoRepo.add(cat);

                    break;
                case 2:
                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Size: ");
                    size = scanner.nextLine();

                    System.out.println("Race: ");
                    String race = scanner.nextLine();

                    Dog dog = new Dog(name, age, size, race);
                    shelterCiapkowoRepo.add(dog);

                    break;
                case 3:
                    shelterCiapkowoRepo.displayAll();
                    break;
            }
        } while (option != 0);
    }
}
