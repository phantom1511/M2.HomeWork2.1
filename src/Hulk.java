public class Hulk extends Avenger implements Printable {
    private String emotion;

    public Hulk(String name, int health, String power, String emotion) {
        super(name, health, power);
        this.emotion = emotion;
    }

    public String getEmotion() {
        return emotion;
    }

    @Override
    public void print() {
        System.out.println(getClass() + "\n" + "Name: " + getName() + "\nHealth: " + getHealth() + "\nPower: " + getPower() + "\nAbility: " + getEmotion());

    }
}
