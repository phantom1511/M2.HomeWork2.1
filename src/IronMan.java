public class IronMan extends Avenger implements Printable{
    private String suit;

    public IronMan(String name, int health, String power, String suit) {
        super(name, health, power);
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public void print() {
        System.out.println(getClass() + "\n" + "Name: " + getName() + "\nHealth: " + getHealth() + "\nPower: " + getPower() + "\nAbility: " + getSuit());
    }
}
