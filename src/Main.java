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
        System.out.println("-----------------------------------------------");
        createObject("Captain America").print();
        System.out.println("-----------------------------------------------");
        createObject("Thor").print();
        System.out.println("-----------------------------------------------");
        createObject("Hulk").print();

    }

    public static Printable createObject(String hero) {
        /*Printable ironMan = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
        Printable captainAmerica = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
        Printable thor = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
        Printable hulk = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");*/

        Printable printable = null;
        switch (hero) {
            case "Iron Man":
                printable = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
                break;
            case "Captain America":
                printable = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
                break;
            case "Thor":
                printable = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
                break;
            case "Hulk":
                printable = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");
                break;
            default:
                System.out.println("Enter correct type");
                break;
        }
        return printable;
    }
}
