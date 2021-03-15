public class ShelterCiapkowoRepo {

    private Animal[] animals = new Animal[10];
    private int index = 0;

    public void add(Animal animal) {
        if (index < animals.length && !exists(animal)) {
            animals[index++] = animal;
        }
    }

    private boolean exists(Animal shelterCiapkowoRepo) {
        for (int i = 0; i < index; i++) {
            if (animals[i].equals(shelterCiapkowoRepo)) {
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (int i = 0; i < index; i++) {
            System.out.println(animals[i]);
        }
    }
}
