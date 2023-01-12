package zoo.animals;

import java.util.Random;

public abstract class Animal {
    public static final String PLACE_CAGE = "в вольере";
    public static final String PLACE_QUARANTINE = "на карантине";
    public static final String PLACE_OUT_OF_CAGE = "убежало";

    // Кличка животного
    private String name;
    // Животное здорово или нет
    private boolean healthy = true;
    // Изменилось ли состояните здоровья животного
    private boolean healthyChanged;
    // Животное голодно или нет
    private boolean hungry = true;
    // Нужно ли вычесать животное
    protected boolean combOut;
    // Нужно ли поменять воду у животного
    protected boolean replaceWater;
    // Где находится животное
    protected String place = PLACE_CAGE;

    protected Random random = new Random();

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthyChanged = this.healthy != healthy;
        this.healthy = healthy;
    }

    public boolean isHealthyChanged() {
        return healthyChanged;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isCombOut() {
        return combOut;
    }

    public void setCombOut(boolean combOut) {
        this.combOut = combOut;
    }

    public boolean isReplaceWater() {
        return replaceWater;
    }

    public void setReplaceWater(boolean replaceWater) {
        this.replaceWater = replaceWater;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void reset() {
        this.hungry = false;
        this.healthy = this.random.nextBoolean();
    }

    public abstract String getType();
}
