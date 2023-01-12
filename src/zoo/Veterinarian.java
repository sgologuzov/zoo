package zoo;

import zoo.animals.Animal;

public class Veterinarian extends Human {
    @Override
    public String getProfession() {
        return "ветеринар";
    }

    @Override
    protected void doCareAnimal(Animal animal) {
        if (animal.isHealthyChanged()) {
            if (!animal.isHealthy()) {
                System.out.printf("[%s] животное %s %s заболело, помещаем его в карантин\n", getProfession(), animal.getType(), animal.getName());
                animal.setPlace(Animal.PLACE_QUARANTINE);
            } else {
                System.out.printf("[%s] животное %s %s выздоровело, помещаем его в вольер\n", getProfession(), animal.getType(), animal.getName());
                animal.setPlace(Animal.PLACE_CAGE);
            }
        }
    }
}
