//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ITank spotter = new Spotter_Tank(new PlainTank());
        System.out.println("Spotter |"+ spotter.getDescription());

        ITank LT = new Light_Tank(new PlainTank());
        System.out.println("Konnyu harckocsi |"+ LT.getDescription());

    }
}