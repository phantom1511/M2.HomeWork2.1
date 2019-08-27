public class Main {

    public static void main(String[] args) {
        /*IronMan ironMan = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
        CaptainAmerica captainAmerica = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
        Thor thor = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
        Hulk hulk = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");

        ironMan.print();
        System.out.println("-----------------------------------------------");
        captainAmerica.print();
        System.out.println("-----------------------------------------------");
        thor.print();
        System.out.println("-----------------------------------------------");
        hulk.print();*/

        createObject("Iron Man");
        System.out.println("-----------------------------------------------");
        createObject("Captain America");
        System.out.println("-----------------------------------------------");
        createObject("Thor");
        System.out.println("-----------------------------------------------");
        createObject("Hulk");
    }

    public static String createObject( String Printable) {
        IronMan ironMan = new IronMan("Tony Stark", 100, "Shooting and Flying", "Iron Man suit Mark 13");
        CaptainAmerica captainAmerica = new CaptainAmerica("Stive Rogers", 100, "Unreal Power for human", "Shield from Titan");
        Thor thor = new Thor("Thor", 500, "God of Thunder", "Sekira special ax, which can hold power of thunder");
        Hulk hulk = new Hulk("Bruce Baner", 150, "Crazy physical power", "Hulk comes out when he is angry");

        String print = Printable;
        switch (print) {
            case "Iron Man":
                ironMan.print();
                break;
            case "Captain America":
                captainAmerica.print();
                break;
            case "Thor":
                thor.print();
                break;
            case "Hulk":
                hulk.print();
                break;
            default:
                System.out.println("Enter correct type");
                break;
        }
        return Printable;
    }
}
