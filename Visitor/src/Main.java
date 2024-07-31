//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TaxVisitor taxCalc = new TaxVisitor();

        Helicopter heli = new Helicopter(27.47);
        Tank MBT_tank = new Tank(31.99);
        Jet jet_Fighter = new Jet(46.99);

        System.out.println(heli.accept(taxCalc));
        System.out.println(MBT_tank.accept(taxCalc));
        System.out.println(jet_Fighter.accept(taxCalc));
    }
}