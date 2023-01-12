package zoo;

import zoo.animals.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Zoo {
    private Veterinarian veterinarian;
    private Zookeeper zookeeper;
    private List<Human> humans;
    private List<Animal> animals;

    private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Zoo() {
        // Люди
        this.veterinarian = new Veterinarian();
        this.zookeeper = new Zookeeper();
        this.humans = new ArrayList<>();
        this.humans.add(this.veterinarian);
        this.humans.add(this.zookeeper);


        // Животные
        this.animals = new ArrayList<>();
        this.animals.add(new Lion("Кузя"));
        this.animals.add(new Tiger("Жора"));
        this.animals.add(new Hypo("Дося"));
        this.animals.add(new Squirrel("Стрелка"));
        this.animals.add(new Squirrel("Ловкач"));
    }

    public void run() {
        Date currentDate = Calendar.getInstance().getTime();
        System.out.printf("Сегодня %s. Зоопарк открылся\n", dateFormat.format(currentDate));
        initDay();
        spentDay();
        System.out.printf("Сегодня %s. Зоопарк закрылся\n", dateFormat.format(currentDate));
    }

    private void initDay() {
        for (Human human : this.humans) {
            // Сброс состояния человека
            human.reset();
        }
    }

    private void spentDay() {
        System.out.println("************ Утреннее обслуживание животных **********");
        for (Animal animal: animals) {
            // Сброс состояния животного
            animal.reset();
            veterinarian.careAnimal(animal);
            zookeeper.careAnimal(animal);
        }

        System.out.println("************ Обед **********");
        for (Human human : this.humans) {
            human.haveLunch();
        }
        System.out.println();

        System.out.println("************ Вечернее обслуживание животных **********");
        for (Animal animal: animals) {
            // Сброс состояния животного
            animal.reset();
            zookeeper.careAnimal(animal);
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.run();
    }
}
