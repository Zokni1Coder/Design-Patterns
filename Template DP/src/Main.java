public class Main {
    public static void main(String[] args) {
        Tank HT = new HeavyTank();
        HT.buildTank();

        Tank AC = new Armored_Car();
        AC.buildTank();

        Tank TD = new Tank_Destroyer();
        TD.buildTank();
    }
}