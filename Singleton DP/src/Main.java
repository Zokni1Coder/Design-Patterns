//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Singleton first_Singleton = Singleton.getInstance();
        System.out.println("Az elso futtatasa tobbszor:");
        System.out.println(first_Singleton.getfutasDB());
        System.out.println(first_Singleton.getfutasDB());
        System.out.println(first_Singleton.getfutasDB());


        Singleton second_Singleton = Singleton.getInstance();
        System.out.println("Az masodik futtatasa tobbszor:");
        System.out.println(second_Singleton.getfutasDB());
        System.out.println(second_Singleton.getfutasDB());
        System.out.println(second_Singleton.getfutasDB());

    }
}

class Singleton {
    private static int futas_DB;
    public int getfutasDB() {
        futas_DB++;
        return futas_DB;
    }
    private Singleton() {
        futas_DB = 0;
    }
    private static Singleton instance = null;
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
