package zoo.animals;

/**
 * Лев
 */
public class Lion extends CatsFamily {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "лев";
    }
}
