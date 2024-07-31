//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Clone_Factory tank_Maker = new Clone_Factory();

        HeavyTank HT = new HeavyTank();

        HeavyTank clonedHT = (HeavyTank) tank_Maker.getClone(HT);

        System.out.println(HT);

        System.out.println(clonedHT);

        System.out.println("HT Hashcode: "+System.identityHashCode(System.identityHashCode(HT)));
        System.out.println("Clone Hashcode: "+System.identityHashCode(System.identityHashCode(clonedHT)));
    }
}