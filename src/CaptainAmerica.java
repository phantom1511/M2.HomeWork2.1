public class CaptainAmerica extends Avenger implements Printable {
    private String shield;

    public CaptainAmerica(String name, int health, String power, String shield) {
        super(name, health, power);
        this.shield = shield;
    }

    public String getShield() {
        return shield;
    }

    @Override
    public void print() {
        System.out.println(getClass() + "\n" + "Name: " + getName() + "\nHealth: " + getHealth() + "\nPower: " + getPower() + "\nAbility: " + getShield());

    }
}
