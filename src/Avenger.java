public class Avenger {
    private String name;
    private int health;
    private String power;

    public Avenger(String name, int health, String power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getPower() {
        return power;
    }
}
