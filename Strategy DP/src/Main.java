//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tank nehezHarckocsi = new HeavyTank();
        Tank konnyuHarckocsi = new LightTank();
        Tank raketvetoHarckocsi = new Tank_Equipted_MissileLauncher();

        System.out.println("Nehez harckocsi tamado ereje: "+ nehezHarckocsi.damage());
        System.out.println("konnyu harckocsi tamado ereje: "+ konnyuHarckocsi.damage());
        System.out.println("Raketaveto harckocsi tamado ereje: "+ raketvetoHarckocsi.damage());
    }
}