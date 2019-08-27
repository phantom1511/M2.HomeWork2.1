public class Thor extends Avenger implements Printable {
    private String sekira;

    public Thor(String name, int health, String power, String sekira) {
        super(name, health, power);
        this.sekira = sekira;
    }

    public String getSekira() {
        return sekira;
    }

    @Override
    public void print() {
        System.out.println(getClass() + "\n" + "Name: " + getName() + "\nHealth: " + getHealth() + "\nPower: " + getPower() + "\nAbility: " + getSekira());

    }
}
