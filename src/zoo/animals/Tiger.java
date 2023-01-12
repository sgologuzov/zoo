package zoo.animals;

/**
 * Тигр
 */
public class Tiger extends CatsFamily {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "тигр";
    }
}
