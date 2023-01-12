package zoo.animals;

/**
 * Семейство кошачьих
 */
public abstract class CatsFamily extends Animal {
    protected CatsFamily(String name) {
        super(name);
    }
    @Override
    public void reset() {
        super.reset();
        this.combOut = this.random.nextBoolean();
    }
}
