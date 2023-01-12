package zoo;

import zoo.animals.Animal;

public class Zookeeper extends Human {
    @Override
    public String getProfession() {
        return "смотритель";
    }

    @Override
    protected void doCareAnimal(Animal animal) {
        if (animal.isHungry()) {
            System.out.printf("[%s] кормление животного %s %s\n", getProfession(), animal.getType(), animal.getName());
            animal.setHungry(false);
        }
        if (animal.isCombOut()) {
            System.out.printf("[%s] вычесывание животного %s %s\n", getProfession(), animal.getType(), animal.getName());
            animal.setCombOut(false);
        }
        if (animal.isReplaceWater()) {
            System.out.printf("[%s] замена воды у животного %s %s\n", getProfession(), animal.getType(), animal.getName());
            animal.setReplaceWater(false);
        }
    }
}
