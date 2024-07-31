//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tank_Builder HT = new HeavyTankBuilder();

        Tank_Engineer tankEngineer = new Tank_Engineer(HT);

        tankEngineer.makeTank();

        Tank elsoTank = tankEngineer.getTank();

        System.out.println("Epult tank:");
        System.out.println("Torony: " +elsoTank.getTankTurret());
        System.out.println("Agyu: "+elsoTank.getTankGun());
        System.out.println("Motor: "+elsoTank.getTankMotor());
    }
}