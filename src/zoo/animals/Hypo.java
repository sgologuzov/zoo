package zoo.animals;

/**
 * Бегемот
 */
public class Hypo extends Animal {
    public Hypo(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "бегемот";
    }

    @Override
    public void reset() {
        super.reset();
        this.replaceWater = this.random.nextBoolean();
    }
}
