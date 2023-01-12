package zoo.animals;

/**
 * Белка
 */
public class Squirrel extends Animal {
    public Squirrel(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "белка";
    }

    @Override
    public void reset() {
        super.reset();
        if (this.place == Animal.PLACE_CAGE && random.nextBoolean()) {
            this.place = Animal.PLACE_OUT_OF_CAGE;
        }
    }
}
