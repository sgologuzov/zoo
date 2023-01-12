package zoo;

import zoo.animals.Animal;

import java.util.Random;

public abstract class Human {
    private boolean hungry;
    private boolean hurt;
    private Random random = new Random();

    public void reset() {
        this.hungry = true;
        this.hurt = false;
    }

    public void careAnimal(Animal animal) {
        System.out.printf("Обслуживание животного %s %s начато. Сотрудник: %s.\n", animal.getType(), animal.getName(), getProfession());
        if (random.nextBoolean()) {
            doHurt(animal);
        }
        checkHurt();
        doCareAnimal(animal);
        if (Animal.PLACE_OUT_OF_CAGE.equals(animal.getPlace())) {
            System.out.printf("[%s] животное %s %s убежало, сейчас поймаю\n", getProfession(), animal.getType(), animal.getName());
            animal.setPlace(Animal.PLACE_CAGE);
        }
        System.out.printf("Обслуживание животного %s %s завершено. Сотрудник: %s.\n", animal.getType(), animal.getName(), getProfession());
        System.out.println();
    }

    private void doHurt(Animal animal) {
        System.out.printf("Сотрудника %s укусило животное %s %s.\n", getProfession(), animal.getType(), animal.getName());
        this.hurt = true;
    }

    private void checkHurt() {
        if (this.hurt) {
            System.out.printf("Сотрудник %s наложил себе повязку.\n", getProfession());
            this.hurt = false;
        }
    }

    public void haveLunch() {
        this.hungry = false;
        System.out.printf("%s пообедал.\n", getProfession());
    }

    public abstract String getProfession();
    protected abstract void doCareAnimal(Animal animal);
}
