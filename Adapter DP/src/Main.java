//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tank_Destroyer TD = new Tank_Destroyer();
        Armored_Car AC = new Armored_Car();
        ITank AC_Adapter = new Armored_Car_Adapter(AC);

        System.out.println("A pancelozott auto:");
        AC.Roll();
        AC.Burst();
        System.out.println("A tank:");
        TD.Move();
        TD.Shot();
        System.out.println("A pancelozott auto adapterrel:");
        AC_Adapter.Move();
        AC_Adapter.Shot();
    }
}