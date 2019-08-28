import static sun.misc.Version.print;

public class Main {


    public static void main(String[] args) {
        /*IronMan ironMan = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
        CaptainAmerica captainAmerica = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
        Thor thor = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
        Hulk hulk = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");

        /*ironMan.print();
        System.out.println("-----------------------------------------------");
        captainAmerica.print();
        System.out.println("-----------------------------------------------");
        thor.print();
        System.out.println("-----------------------------------------------");
        hulk.print();*/

        /*createObject("Iron Man");
        System.out.println("-----------------------------------------------");
        createObject("Captain America");
        System.out.println("-----------------------------------------------");
        createObject("Thor");
        System.out.println("-----------------------------------------------");
        createObject("Hulk");*/


        createObject("Iron Man").print();
        ((Printable) createObject("Captain America")).print();
        ((Printable) createObject("Thor")).print();
        ((Printable) createObject("Hulk")).print();

    }

    public static String createObject(String printable) {
        Printable ironMan = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
        Printable captainAmerica = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
        Printable thor = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
        Printable hulk = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");


        String print = printable;
        switch (print) {
            case "Iron Man":
                Printable ironMan1 = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
                ironMan1 = ironMan;
                break;
            case "Captain America":
                Printable captainAmerica1 = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
                captainAmerica1 = captainAmerica;
                break;
            case "Thor":
                Printable thor1 = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
                thor1 = thor;
                break;
            case "Hulk":
                Printable hulk1 = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");
                hulk1 = hulk;
                break;
            default:
                System.out.println("Enter correct type");
                break;
        }
        return printable;
    }
}
